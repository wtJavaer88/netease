package com.wulitao.netease.utils;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wulitao.netease.constants.NeteaseConfig;
import com.wulitao.netease.dto.CommentDto;
import com.wulitao.netease.dto.LyricDto;
import com.wulitao.netease.dto.SongDto;
import com.wulitao.netease.dto.UrlDto;
import com.wulitao.netease.entity.Account;
import com.wulitao.netease.entity.Comment;
import com.wulitao.netease.entity.Song;
import com.wulitao.netease.entity.Url;


public class SongUtil implements NeteaseConfig{
	
	/**
	 * 通过歌名搜索歌曲，返回结果（歌曲集合result，和结果总数count）
	 */
	public static JSONObject getSongsInfoByName(SongDto dto){
		JSONObject object = new JSONObject();
		List<Song> songs = new ArrayList<Song>();
		int songsCount;
		String result = (String) HttpUtil.getInstance().connect(SONG_INFO)
				.data(PARAMS_NAME, NeteaseEncryptUtil.getParams(JSONObject.toJSONString(dto)))
				.data(ENCSECKEY_NAME, NeteaseEncryptUtil.getEncSecKey())
				.post();
		JSONObject obj = JSONObject.parseObject(result);
		if (obj.getIntValue("code") == HttpURLConnection.HTTP_OK) {
			JSONObject resultObj = (JSONObject)obj.get("result");
			JSONArray array = (JSONArray) resultObj.get("songs");
			songs = JSONArray.parseArray(array.toJSONString(), Song.class);
			songsCount = resultObj.getIntValue("songCount");
			object = JSONUtil.getResultWithPage(songs, songsCount);
		}
		return object;
	}

	/**
	 * 通过歌曲的id返回在线mp3的地址
	 */
	public static Url getSongUrl(long id){
		UrlDto dto = new UrlDto();
		dto.getIds()[0] = id + "";
		String result = (String) HttpUtil.getInstance().connect(SONG_URL)
			.data(PARAMS_NAME, NeteaseEncryptUtil.getParams(JSONObject.toJSONString(dto)))
			.data(ENCSECKEY_NAME, NeteaseEncryptUtil.getEncSecKey())
			.cookie(Account.getInstance().getCookie())
			.post();
		if (result == null || result == "") {
			return null;
		}
		JSONObject obj = JSONObject.parseObject(result);
		// data：数据信息；code：状态码
		JSONArray array = (JSONArray) obj.get("data");
		List<Url> urls = new ArrayList<Url>();
		if (obj.getIntValue("code") == HttpURLConnection.HTTP_OK) {
			for (Object object : array) {
				JSONObject o = (JSONObject) object;
				Url url = JSONObject.toJavaObject(o, Url.class);
				urls.add(url);
			}
		}
		return urls.isEmpty() ? null : urls.get(0);
	}
	
	/**
	 * 获取歌曲评论相关信息
	 */
	public static Map<String, Object> getSongComments(CommentDto dto){
		Map<String, Object> map = new HashMap<String, Object>();
		List<Comment> hotComments, comments;
		int total;
		String result = (String) HttpUtil.getInstance().connect(SONG_COMMENT + dto.getRid())
				.data(PARAMS_NAME, NeteaseEncryptUtil.getParams(JSONObject.toJSONString(dto)))
				.data(ENCSECKEY_NAME, NeteaseEncryptUtil.getEncSecKey())
				.post();
		JSONObject obj = JSONObject.parseObject(result);
		if (obj.getIntValue("code") == HttpURLConnection.HTTP_OK) {
			// 热门评论
			hotComments = JSONArray.parseArray(obj.getString("hotComments"), Comment.class);
			// 所有评论
			comments = JSONArray.parseArray(obj.getString("comments"), Comment.class);
			// 评论总数
			total = obj.getIntValue("total");
			map.put("hotComments", hotComments);
			map.put("comments", comments);
			map.put("total", total);
		}
		return map;
	}
	
	/**
	 * 获取歌词信息
	 */
	public static String getLyric(LyricDto dto){
		String lyric = "";
		String result = (String) HttpUtil.getInstance().connect(SONG_LYRICS)
				.data(PARAMS_NAME, NeteaseEncryptUtil.getParams(JSONObject.toJSONString(dto)))
				.data(ENCSECKEY_NAME, NeteaseEncryptUtil.getEncSecKey())
				.post();
		JSONObject obj = JSONObject.parseObject(result);
		if (obj.getIntValue("code") == HttpURLConnection.HTTP_OK) {
			JSONObject o = obj.getJSONObject("lrc");
			lyric = o.getString("lyric");
		}
		return lyric;
	}
}
