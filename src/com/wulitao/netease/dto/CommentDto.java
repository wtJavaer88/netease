package com.wulitao.netease.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

/**
 * 评论dto，注明toJSONString()字段的顺序
 */
@JSONType(orders = {"rid", "offset", "total", "limit", "csrf_token"})
public class CommentDto extends BaseDto {

	private String rid;
	
	private String total = "true";
	
	/**
	 * 注明不参与序列化的字段，toJSONString()不会输出该字段
	 */
	@JSONField(serialize=false)
	private Long songId;

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public Long getSongId() {
		return songId;
	}

	/**
	 * 赋值songId的同时，给rid赋值
	 */
	public void setSongId(Long songId) {
		this.songId = songId;
		setRid("R_SO_4_" + songId);
	}
}
