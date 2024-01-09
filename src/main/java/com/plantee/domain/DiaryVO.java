package com.plantee.domain;

import java.util.Date;

public class DiaryVO {
   private int diary_id;
   private int user_id;
   private int plant_id;
   private String plant_name;
   private String image;
   private String contents;
   private Date reg_date;
   private Date last_watering;
   private String icon_sun;
   private String icon_water;
   private int category;
   private String watering;
   private String sunlight;
   private Date fmtdate;
   private Date waterdate;
   private Date date_now;
   private Date date_water;
   private Date date_medicine;
   private Date date_change;
   private String uid;
   private String common_name;
   
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
public int getPlant_id() {
	return plant_id;
}
public void setPlant_id(int plant_id) {
	this.plant_id = plant_id;
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
public Date getLast_watering() {
	return last_watering;
}
public void setLast_watering(Date last_watering) {
	this.last_watering = last_watering;
}
public String getIcon_sun() {
	return icon_sun;
}
public void setIcon_sun(String icon_sun) {
	this.icon_sun = icon_sun;
}
public String getIcon_water() {
	return icon_water;
}
public void setIcon_water(String icon_water) {
	this.icon_water = icon_water;
}
public int getCategory() {
	return category;
}
public void setCategory(int category) {
	this.category = category;
}
public String getWatering() {
	return watering;
}
public void setWatering(String watering) {
	this.watering = watering;
}
public String getSunlight() {
	return sunlight;
}
public void setSunlight(String sunlight) {
	this.sunlight = sunlight;
}
public Date getFmtdate() {
	return fmtdate;
}
public void setFmtdate(Date fmtdate) {
	this.fmtdate = fmtdate;
}
public Date getWaterdate() {
	return waterdate;
}
public void setWaterdate(Date waterdate) {
	this.waterdate = waterdate;
}
public Date getDate_now() {
	return date_now;
}
public void setDate_now(Date date_now) {
	this.date_now = date_now;
}
public Date getDate_water() {
	return date_water;
}
public void setDate_water(Date date_water) {
	this.date_water = date_water;
}
public Date getDate_medicine() {
	return date_medicine;
}
public void setDate_medicine(Date date_medicine) {
	this.date_medicine = date_medicine;
}
public Date getDate_change() {
	return date_change;
}
public void setDate_change(Date date_change) {
	this.date_change = date_change;
}
public String getUid() {
	return uid;
}
public void setUid(String uid) {
	this.uid = uid;
}
public String getCommon_name() {
	return common_name;
}
public void setCommon_name(String common_name) {
	this.common_name = common_name;
}

@Override
public String toString() {
	return "DiaryVO [diary_id=" + diary_id + ", user_id=" + user_id + ", plant_id=" + plant_id + ", plant_name="
			+ plant_name + ", image=" + image + ", contents=" + contents + ", reg_date=" + reg_date + ", last_watering="
			+ last_watering + ", icon_sun=" + icon_sun + ", icon_water=" + icon_water + ", category=" + category
			+ ", watering=" + watering + ", sunlight=" + sunlight + ", fmtdate=" + fmtdate + ", waterdate=" + waterdate
			+ ", date_now=" + date_now + ", date_water=" + date_water + ", date_medicine=" + date_medicine
			+ ", date_change=" + date_change + ", uid=" + uid + ", common_name=" + common_name + "]";
}
   
   
}