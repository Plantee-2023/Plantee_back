package com.plantee.domain;

import java.util.Date;

public class StoreVO {
	private int store_id;
	private int user_id;
	private String uid;
	private String nickname;
	private String title;
	private String contents;
	private String image;
	private String tag;
	private int price;
	private int stock;
	private int level;
	private int review_cnt;
	private int like_cnt;
	private int category;
	private Date reg_date;
	private Date mdfy_date;

	@Override
	public String toString() {
		return "StoreVO [store_id=" + store_id + ", user_id=" + user_id + ", uid=" + uid + ", nickname=" + nickname
				+ ", title=" + title + ", contents=" + contents + ", image=" + image + ", tag=" + tag + ", price="
				+ price + ", stock=" + stock + ", level=" + level + ", review_cnt=" + review_cnt + ", like_cnt="
				+ like_cnt + ", category=" + category + ", reg_date=" + reg_date + ", mdfy_date=" + mdfy_date + "]";
	}

	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getReview_cnt() {
		return review_cnt;
	}

	public void setReview_cnt(int review_cnt) {
		this.review_cnt = review_cnt;
	}

	public int getLike_cnt() {
		return like_cnt;
	}

	public void setLike_cnt(int like_cnt) {
		this.like_cnt = like_cnt;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public Date getMdfy_date() {
		return mdfy_date;
	}

	public void setMdfy_date(Date mdfy_date) {
		this.mdfy_date = mdfy_date;
	}

}