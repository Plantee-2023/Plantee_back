package com.plantee.domain;

import java.util.Date;

public class RecipeVO {

	private int recipe_id;
	private String uid;
	private String title;
	private String  description;
	private String image;
	private int level;
	private int view_cnt;
	private int like_cnt;
	private int coment_cnt;
	private int category;
	private Date reg_date;
	private Date mdfy_date;
	
	public int getRecipe_id() {
		return recipe_id;
	}
	public void setRecipe_id(int recipe_id) {
		this.recipe_id = recipe_id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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
	public int getComent_cnt() {
		return coment_cnt;
	}
	public void setComent_cnt(int coment_cnt) {
		this.coment_cnt = coment_cnt;
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
	
	@Override
	public String toString() {
		return "RecipeVO [recipe_id=" + recipe_id + ", uid=" + uid + ", title=" + title + ", description=" + description
				+ ", image=" + image + ", level=" + level + ", view_cnt=" + view_cnt + ", like_cnt=" + like_cnt
				+ ", coment_cnt=" + coment_cnt + ", category=" + category + ", reg_date=" + reg_date + ", mdfy_date="
				+ mdfy_date + "]";
	}
}