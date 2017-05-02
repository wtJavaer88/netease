package com.wulitao.netease.dto;

import com.alibaba.fastjson.annotation.JSONType;

@JSONType(orders={"ids", "br", "csrf_token"})
public class UrlDto {

	/**
	 * 初始化数组长度
	 */
	private String[] ids = new String[1];
	
	private long br = 128000;
	
	private String csrf_token;

	public String[] getIds() {
		return ids;
	}

	public void setIds(String[] ids) {
		this.ids = ids;
	}

	public long getBr() {
		return br;
	}

	public void setBr(long br) {
		this.br = br;
	}

	public String getCsrf_token() {
		return csrf_token;
	}

	public void setCsrf_token(String csrf_token) {
		this.csrf_token = csrf_token;
	}
}
