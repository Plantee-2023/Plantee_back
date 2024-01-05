package com.plantee.domain;

import java.util.Date;

public class DiaryVO {
	private String plant_name;
	private String image;
	private String contents;
	private Date reg_date;
	private int category;
	
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
		return "DiaryVO [plant_name=" + plant_name + ", image=" + image + ", contents=" + contents + ", reg_date="
				+ reg_date + ", category=" + category + "]";
	}

}