package com.plantee.domain;

 

public class VoteVO {
	private int vote_id;
	private int post_id;
	private String vote_title;
	private int option;
	private String res;
	private String uid;
	private String res2;
	private String res3;
	private String title;
	public int getVote_id() {
		return vote_id;
	}
	public void setVote_id(int vote_id) {
		this.vote_id = vote_id;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getVote_title() {
		return vote_title;
	}
	public void setVote_title(String vote_title) {
		this.vote_title = vote_title;
	}
	public int getOption() {
		return option;
	}
	public void setOption(int option) {
		this.option = option;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getRes2() {
		return res2;
	}
	public void setRes2(String res2) {
		this.res2 = res2;
	}
	public String getRes3() {
		return res3;
	}
	public void setRes3(String res3) {
		this.res3 = res3;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "VoteVO [vote_id=" + vote_id + ", post_id=" + post_id + ", vote_title=" + vote_title + ", option="
				+ option + ", res=" + res + ", uid=" + uid + ", res2=" + res2 + ", res3=" + res3 + ", title=" + title
				+ ", getVote_id()=" + getVote_id() + ", getPost_id()=" + getPost_id() + ", getVote_title()="
				+ getVote_title() + ", getOption()=" + getOption() + ", getRes()=" + getRes() + ", getUid()=" + getUid()
				+ ", getRes2()=" + getRes2() + ", getRes3()=" + getRes3() + ", getTitle()=" + getTitle()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	 
 
	
	
	 
	

}
