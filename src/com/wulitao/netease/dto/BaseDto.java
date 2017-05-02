package com.wulitao.netease.dto;

public class BaseDto {

	/**
	 * 偏移量
	 */
	private String offset;
	
	/**
	 * 一次返回的数量
	 */
	private String limit;
	
	private String csrf_token;

	public String getCsrf_token() {
		return csrf_token;
	}

	public void setCsrf_token(String csrf_token) {
		this.csrf_token = csrf_token;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}
}
