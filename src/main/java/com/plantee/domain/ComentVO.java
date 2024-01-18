package com.plantee.domain;

import java.util.Date;

public class ComentVO {

	private int user_id;
	private int recipe_id;
	private int post_id;
	private int store_id;
	private String contents;
	private String image;
	private int stars;
	private Date reg_date;
	private Date mdfy_date;
	private int like_cnt;
	private int upper_id;
	
	
	
	public int getUser_id() {
		return user_id;
	}



	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}



	public int getRecipe_id() {
		return recipe_id;
	}



	public void setRecipe_id(int recipe_id) {
		this.recipe_id = recipe_id;
	}



	public int getPost_id() {
		return post_id;
	}



	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}



	public int getStore_id() {
		return store_id;
	}



	public void setStore_id(int store_id) {
		this.store_id = store_id;
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



	public int getLike_cnt() {
		return like_cnt;
	}



	public void setLike_cnt(int like_cnt) {
		this.like_cnt = like_cnt;
	}



	public int getUpper_id() {
		return upper_id;
	}



	public void setUpper_id(int upper_id) {
		this.upper_id = upper_id;
	}



	@Override
	public String toString() {
		return "ComentVO [user_id=" + user_id + ", recipe_id=" + recipe_id + ", post_id=" + post_id + ", store_id="
				+ store_id + ", contents=" + contents + ", image=" + image + ", stars=" + stars + ", reg_date="
				+ reg_date + ", mdfy_date=" + mdfy_date + ", like_cnt=" + like_cnt + ", upper_id=" + upper_id + "]";
	}
	
	
}
