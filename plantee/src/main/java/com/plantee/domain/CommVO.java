package com.plantee.domain;

import java.util.Date;

public class CommVO {
	
	private int post_id;
	private String uid;
	private String nikname;
	private String title;
	private String content;
	private int  category;
	
	
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	
	
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getNikname() {
		return nikname;
	}
	public void setNikname(String nikname) {
		this.nikname = nikname;
	}
	@Override
	public String toString() {
		return "CommVO [post_id=" + post_id + ", title=" + title + ", content=" + content + ", category=" + category
				+ "]";
	}
	 
	
}
