package com.wulitao.netease.entity;

import java.net.HttpCookie;

/**
 * 网易登录用户，设置为单例模式
 * @author wulitaotao
 * @date 2017年2月18日
 * @subscription
 */
public class Account {

	private static Account account = null;
	
	/**
	 * 登录保持cookie
	 */
	private HttpCookie cookie;
	
	private Account(){
		
	}
	
	public static Account getInstance(){
		if (account == null) {
			account = new Account();
		}
		return account;
	}

	public HttpCookie getCookie() {
		return cookie;
	}

	public void setCookie(HttpCookie cookie) {
		this.cookie = cookie;
	}
}
