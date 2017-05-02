package com.wulitao.netease.entity;

import java.util.List;

public class Comment {
	
	private User user;
	
	private long commentId;
	
	private List<ReplyComment> beReplied;
	
	private long time;
	
	private long likedCount;
	
	private String content;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getCommentId() {
		return commentId;
	}

	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public long getLikedCount() {
		return likedCount;
	}

	public void setLikedCount(long likedCount) {
		this.likedCount = likedCount;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<ReplyComment> getBeReplied() {
		return beReplied;
	}

	public void setBeReplied(List<ReplyComment> beReplied) {
		this.beReplied = beReplied;
	}
}
