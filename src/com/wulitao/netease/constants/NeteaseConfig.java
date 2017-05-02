package com.wulitao.netease.constants;

public interface NeteaseConfig {
	
	/**
	 * 16位随机key，由此可确定encSecKey
	 */
	String RANDOM_KEY = "ffffffffffffffff";
	
	/**
	 * AES算法加密偏移量
	 */
	String IV_PARAMETER = "0102030405060708";

	/**
	 * encSecKey
	 */
	String ENCSECKEY_STRING = "cf9dff26e87f90e1ae5bd8cc400d1cb9a8cd97739f6305c6ca17069715cdd3c3c249cc016f338867b9fe77b9e17a58c263a233467889d4bb76c0b5f15ec1147aa6e707cde8d586a6010ef0872b0bdfce51adf58e45086b60537276198f4475c6560388f25ec3d38f36908b221e168bdd2a59254f8b15ceaa2df74ba0dff3499c";

	/**
	 * 第二个参数
	 */
	String SECOND_PARAM = "010001";
	
	/**
	 * 第三个参数
	 */
	String THIRD_PARAM = "00e0b509f6259df8642dbc35662901477df22677ec152b5ff68ace615bb7b725152b3ab17a876aea8a5aa76d2e417629ec4ee341f56135fccf695280104e0312ecbda92557c93870114af6c9d05c4f7f0c3685b7a46bee255932575cce10b424d813cfe4875d3e82047b97ddef52741d546b8e289dc6935b3ece0462db0a22b8e7";
	
	/**
	 * 第四个参数
	 */
	String FOURTH_PARAM = "0CoJUm6Qyw8W8jud";
	
	/**
	 * POST提交表单参数params名称
	 */
	String PARAMS_NAME = "params";
	
	/**
	 * POST提交表单参数encSecKey名称
	 */
	String ENCSECKEY_NAME = "encSecKey";
	
	/**
	 * 用户cookie的key
	 */
	String MUSIC_U = "MUSIC_U";
	
	/**
	 * 网易云音乐接口baseUrl
	 */
	String BASE_URL = "http://music.163.com/weapi";

	/**
	 * 获取mp3的地址
	 */
	String SONG_URL = BASE_URL + "/song/enhance/player/url";
	
	/**
	 * 查询歌曲信息的接口地址
	 */
	String SONG_INFO = BASE_URL + "/cloudsearch/get/web";
	
	/**
	 * 评论api接口地址
	 */
	String SONG_COMMENT = BASE_URL + "/v1/resource/comments/";
	
	/**
	 * 获取歌词地址
	 */
	String SONG_LYRICS = BASE_URL + "/song/lyric";
	
	/**
	 * 登录地址
	 */
	String USER_LOGIN = BASE_URL + "/login";
	
	/**
	 * 手机号登录地址
	 */
	String USER_LOGIN_PHONE = USER_LOGIN + "/cellphone";
}
