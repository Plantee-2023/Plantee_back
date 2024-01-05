package com.plantee.domain;

import java.util.Date;

public class StoreVO {
	private String title;
	private String contents;
	private String image;
	private String tag;
	private int price;
	private int stock;
	private int level;
	private int view_cnt;
	private int like_cnt;
	private int category;
	private Date reg_date;
	private Date mdfy_date;

	@Override
	public String toString() {
		return "StoreVO [title=" + title + ", contents=" + contents + ", image=" + image + ", tag=" + tag + ", price="
				+ price + ", stock=" + stock + ", level=" + level + ", view_cnt=" + view_cnt + ", like_cnt=" + like_cnt
				+ ", category=" + category + ", reg_date=" + reg_date + ", mdfy_date=" + mdfy_date + "]";
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

	public int getView_cnt() {
		return view_cnt;
	}

	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
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