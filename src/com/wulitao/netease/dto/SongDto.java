package com.wulitao.netease.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

@JSONType(orders={"hlpretag", "hlposttag", "s", "type", "offset", "total", "limit", "csrf_token"})
public class SongDto extends BaseDto {

	@JSONField(serialize=false)
	private String name;
	
	private String hlpretag = "<span class=\"s-fc7\">";
	
	private String hlposttag = "</span>";
	
	private String s;
	
	private String type = "1";
	
	private String total = "true";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		setS(name);
	}

	public String getHlpretag() {
		return hlpretag;
	}

	public void setHlpretag(String hlpretag) {
		this.hlpretag = hlpretag;
	}

	public String getHlposttag() {
		return hlposttag;
	}

	public void setHlposttag(String hlposttag) {
		this.hlposttag = hlposttag;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
}
