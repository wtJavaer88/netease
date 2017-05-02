package com.wulitao.netease.dto;

import com.alibaba.fastjson.annotation.JSONType;

@JSONType(orders={"phone", "password", "rememberLogin", "csrf_token"})
public class LoginDto {

	private String phone;
	
	private String password;
	
	private String rememberLogin = "true";
	
	private String csrf_token;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRememberLogin() {
		return rememberLogin;
	}

	public void setRememberLogin(String rememberLogin) {
		this.rememberLogin = rememberLogin;
	}

	public String getCsrf_token() {
		return csrf_token;
	}

	public void setCsrf_token(String csrf_token) {
		this.csrf_token = csrf_token;
	}
}
