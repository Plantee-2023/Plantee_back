package com.plantee.domain;

import java.util.Date;

public class MagazineVO {
	private int post_id;
	private int user_id;
	private int plant_id;
	private String title;
	private String contents;
	private String image;
	private Date red_date;
	private Date mdfy_date;
	private String link;
	private int price;
	private int view_cnt;
	private int like_cnt;
	private int coment_cnt;
	private int filter;
	private int category;
	private String uid;
	private String nickname;
	private int magazine_num;
	
	public int getMagazine_num() {
		return magazine_num;
	}
	public void setMagazine_num(int magazine_num) {
		this.magazine_num = magazine_num;
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
	public int getPlant_id() {
		return plant_id;
	}
	public void setPlant_id(int plant_id) {
		this.plant_id = plant_id;
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
	public Date getRed_date() {
		return red_date;
	}
	public void setRed_date(Date red_date) {
		this.red_date = red_date;
	}
	public Date getMdfy_date() {
		return mdfy_date;
	}
	public void setMdfy_date(Date mdfy_date) {
		this.mdfy_date = mdfy_date;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
	public int getFilter() {
		return filter;
	}
	public void setFilter(int filter) {
		this.filter = filter;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
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
	@Override
	public String toString() {
		return "MagazineVO [post_id=" + post_id + ", user_id=" + user_id + ", plant_id=" + plant_id + ", title=" + title
				+ ", contents=" + contents + ", image=" + image + ", red_date=" + red_date + ", mdfy_date=" + mdfy_date
				+ ", link=" + link + ", price=" + price + ", view_cnt=" + view_cnt + ", like_cnt=" + like_cnt
				+ ", coment_cnt=" + coment_cnt + ", filter=" + filter + ", category=" + category + ", uid=" + uid
				+ ", nickname=" + nickname + ", magazine_num=" + magazine_num + "]";
	}
	
	
	
	
	
}
