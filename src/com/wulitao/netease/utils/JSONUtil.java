package com.wulitao.netease.utils;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class JSONUtil {

	/**
	 * 得到分页展示结果的json
	 */
	public static JSONObject getResultWithPage(List<?> result, int count){
		JSONObject object = new JSONObject();
		object.put("result", result);
		object.put("count", count);
		return object;
	}
}
