package com.plantee.domain;


public class CommVO {
	private int post_origin;
	private int reply;
	private int plant_id;
	private String plant_title; 
	private String plant_link;
	private int store_id;
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
	public int getPlant_id() {
		return plant_id;
	}
	public void setPlant_id(int plant_id) {
		this.plant_id = plant_id;
	}
	public String getPlant_title() {
		return plant_title;
	}
	public void setPlant_title(String plant_title) {
		this.plant_title = plant_title;
	}
	public String getPlant_link() {
		return plant_link;
	}
	public void setPlant_link(String plant_link) {
		this.plant_link = plant_link;
	}
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
	public int getFilter() {
		return filter;
	}
	public void setFilter(int filter) {
		this.filter = filter;
	}
	
	@Override
	public String toString() {
		return "CommVO [post_origin=" + post_origin + ", reply=" + reply + ", plant_id=" + plant_id + ", plant_title="
				+ plant_title + ", plant_link=" + plant_link + ", store_id=" + store_id + ", post_id=" + post_id
				+ ", user_id=" + user_id + ", price=" + price + ", uid=" + uid + ", nikname=" + nikname + ", title="
				+ title + ", image=" + image + ", contents=" + contents + ", category=" + category + ", filter="
				+ filter + "]";
	}


	
	
	 
	 
	
}