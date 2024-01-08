package com.plantee.domain;

import java.util.Date;

public class CommentsVO extends UserVO {
	private int store_id;
	private String contents;
	private String image;
	private int stars;
	private int stars_avg;
	private int like_cnt;
	private int category;
	private String reg_date;
	private Date mdfy_date;
	private int upper_id;
	private int lvl;
	private int comment_id;
	
	public int getComment_id() {
		return comment_id;
	}

	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	@Override
	public String toString() {
		return "CommentsVO [store_id=" + store_id + ", contents=" + contents + ", image=" + image + ", stars=" + stars
				+ ", stars_avg=" + stars_avg + ", like_cnt=" + like_cnt + ", category=" + category + ", reg_date="
				+ reg_date + ", mdfy_date=" + mdfy_date + ", upper_id=" + upper_id + ", lvl=" + lvl + ", comment_id="
				+ comment_id + "]";
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

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public int getStars_avg() {
		return stars_avg;
	}

	public void setStars_avg(int stars_avg) {
		this.stars_avg = stars_avg;
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

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public Date getMdfy_date() {
		return mdfy_date;
	}

	public void setMdfy_date(Date mdfy_date) {
		this.mdfy_date = mdfy_date;
	}

	public int getUpper_id() {
		return upper_id;
	}

	public void setUpper_id(int upper_id) {
		this.upper_id = upper_id;
	}

	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

}
