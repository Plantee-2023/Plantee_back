package com.plantee.domain;

import java.util.List;

public class PurchaseVO {
	private String purchase_id;
	private String user_id;
	private String uname;
	private String phone;
	private String address1;
	private String address2;
	private String oid;
	private int sum;
	private List<CartVO> orders;

	@Override
	public String toString() {
		return "PurchaseVO [purchase_id=" + purchase_id + ", user_id=" + user_id + ", uname=" + uname + ", phone="
				+ phone + ", address1=" + address1 + ", address2=" + address2 + ", oid=" + oid + ", sum=" + sum
				+ ", orders=" + orders + "]";
	}

	public String getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(String purchase_id) {
		this.purchase_id = purchase_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
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

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public List<CartVO> getOrders() {
		return orders;
	}

	public void setOrders(List<CartVO> orders) {
		this.orders = orders;
	}

}
