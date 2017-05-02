package com.wulitao.netease.utils;

import java.net.HttpCookie;
import java.net.HttpURLConnection;

import com.alibaba.fastjson.JSONObject;
import com.wulitao.netease.constants.NeteaseConfig;
import com.wulitao.netease.dto.LoginDto;
import com.wulitao.netease.entity.Account;

public class AccountUtil implements NeteaseConfig {

	public static Account loginByPhone(String phone, String password){
		LoginDto dto = new LoginDto();
		dto.setPhone(phone);
		dto.setPassword(MD5Util.EncodeByMd5(password));
		return login(dto);
	}
	
	public static Account login(Object dto){
		HttpUtil.getInstance().connect(USER_LOGIN_PHONE)
				.data(PARAMS_NAME, NeteaseEncryptUtil.getParams(JSONObject.toJSONString(dto)))
				.data(ENCSECKEY_NAME, NeteaseEncryptUtil.getEncSecKey())
				.async()
				.callBack(new HttpUtil.Callback() {

					@Override
					public void success(HttpURLConnection connection, Object response) {
						HttpCookie cookie = HttpUtil.getCookieByName(connection, MUSIC_U);
						Account.getInstance().setCookie(cookie);
						
						JSONObject obj = JSONObject.parseObject(response.toString());
						if (obj.getIntValue("code") == HttpURLConnection.HTTP_OK) {
							JSONObject o = obj.getJSONObject("account");
							System.out.println(o);
						}
					}

					@Override
					public void failure(Exception e) {
						
					}
				})
				.post();
		return Account.getInstance();
	}
}
