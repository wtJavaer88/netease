package com.wulitao.netease.dto;

import com.alibaba.fastjson.annotation.JSONType;

@JSONType(orders = {"id", "lv", "tv", "csrf_token"})
public class LyricDto {

	private String id;
	
	private int lv = -1;
	
	private int tv = -1;
	
	private String csrf_token;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getTv() {
		return tv;
	}

	public void setTv(int tv) {
		this.tv = tv;
	}

	public String getCsrf_token() {
		return csrf_token;
	}

	public void setCsrf_token(String csrf_token) {
		this.csrf_token = csrf_token;
	}
}
