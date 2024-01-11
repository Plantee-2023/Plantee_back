package com.plantee.domain;

import java.util.Date;

public class UserVO {
	private String uid;
	private String upass;
	private String uname;
	private String nickname;
	private String phone;
	private String address1;
	private String address2;
	private String image;
	private String email;
	private String seller_yn;
	private String reg_date;
	private Date mdfy_date;
	private int level;
	private int exp;

	@Override
	public String toString() {
		return "UserVO [ uid=" + uid + ", upass=" + upass + ", uname=" + uname + ", nickname="
				+ nickname + ", phone=" + phone + ", address1=" + address1 + ", address2=" + address2 + ", image="
				+ image + ", email=" + email + ", seller_yn=" + seller_yn + ", reg_date=" + reg_date + ", mdfy_date="
				+ mdfy_date + ", level=" + level + ", exp=" + exp + "]";
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSeller_yn() {
		return seller_yn;
	}

	public void setSeller_yn(String seller_yn) {
		this.seller_yn = seller_yn;
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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

}