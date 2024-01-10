package com.plantee.domain;

import java.util.Date;

public class CommVO {
	private int post_origin;
	private int reply;
	private int post_id;
	private int user_id;
	private int price;
	private String uid;
	private String nikname;
	private String title;
	private String image;
	private String contents;
	private int  category;
	private int filter;
	
	
	
	
	public int getPost_origin() {
		return post_origin;
	}



	public void setPost_origin(int post_origin) {
		this.post_origin = post_origin;
	}



	public int getReply() {
		return reply;
	}



	public void setReply(int reply) {
		this.reply = reply;
	}



	public int getFilter() {
		return filter;
	}



	public void setFilter(int filter) {
		this.filter = filter;
	}


	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "CommVO [post_id=" + post_id + ", uid=" + uid + ", nikname=" + nikname + ", title=" + title + ", image="
				+ image + ", contents=" + contents + ", category=" + category + "]";
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	 
	 
	
}