package com.wulitao.netease.utils;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import com.wulitao.netease.constants.NeteaseConfig;

/**
 * 网易云加密算法工具类
 * @author wulitao
 * @date 2017年2月19日
 * @subscription
 */
public class NeteaseEncryptUtil implements NeteaseConfig {
	
	/**
	 * 加密算法
	 */
	public static String encrypt(String text, String secKey) throws Exception {
		byte[] raw = secKey.getBytes();
		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		// "算法/模式/补码方式"
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		// 使用CBC模式，需要一个向量iv，可增加加密算法的强度
		IvParameterSpec iv = new IvParameterSpec(IV_PARAMETER.getBytes());
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
		byte[] encrypted = cipher.doFinal(text.getBytes());
		return DatatypeConverter.printBase64Binary(encrypted);
	}
	
	public static String getParams(String data){
		String params = "";
		try {
			params = encrypt(encrypt(data, FOURTH_PARAM), RANDOM_KEY);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return params;
	}
	
	public static String getEncSecKey(){
		return ENCSECKEY_STRING;
	}
}
