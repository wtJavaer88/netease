package com.wulitao.netease.entity;

public class Album {

	private int id;
	
	private String name;
	
	private String picUrl;
	
	private String pic_str;
	
	private long pic;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPic_str() {
		return pic_str;
	}

	public void setPic_str(String pic_str) {
		this.pic_str = pic_str;
	}

	public long getPic() {
		return pic;
	}

	public void setPic(long pic) {
		this.pic = pic;
	}
}
