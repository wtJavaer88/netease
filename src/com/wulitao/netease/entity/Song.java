package com.wulitao.netease.entity;
import java.util.List;

public class Song {

	private long id;
	
	private String name;
	
	private List<Author> ar;
	
	private Album al;
	
	/**
	 * 得到歌曲作者姓名
	 */
	public String getAuthorsName(){
		if (ar == null || ar.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        // encode下字符串，避免参数含有特殊字符
        for (Author author : ar) {
        	builder.append(author.getName());
            builder.append("/");
        }
        // 去掉最后一个&
        return builder.substring(0, builder.length() - 1);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Author> getAr() {
		return ar;
	}

	public void setAr(List<Author> ar) {
		this.ar = ar;
	}

	public Album getAl() {
		return al;
	}

	public void setAl(Album al) {
		this.al = al;
	}
}
