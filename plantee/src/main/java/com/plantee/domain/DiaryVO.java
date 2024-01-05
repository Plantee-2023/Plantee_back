package com.plantee.domain;

import java.util.Date;

public class DiaryVO {
	private int diary_id;
	private int user_id;
	private String plant_name;
	private String image;
	private String contents;
	private Date reg_date;
	private int category;
	private Date fmtdate;
	
	public int getDiary_id() {
		return diary_id;
	}
	public void setDiary_id(int diary_id) {
		this.diary_id = diary_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getFmtdate() {
		return fmtdate;
	}
	public void setFmtdate(Date fmtdate) {
		this.fmtdate = fmtdate;
	}
	public String getPlant_name() {
		return plant_name;
	}
	public void setPlant_name(String plant_name) {
		this.plant_name = plant_name;
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
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "DiaryVO [diary_id=" + diary_id + ", user_id=" + user_id + ", plant_name=" + plant_name + ", image="
				+ image + ", contents=" + contents + ", reg_date=" + reg_date + ", category=" + category + ", fmtdate="
				+ fmtdate + "]";
	}
	
}