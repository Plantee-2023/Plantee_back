package com.plantee.domain;

public class QueryVO { // DTO
	private String query;
	private int size;
	private int page;
	private int start;
	private String key;
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	@Override
	public String toString() {
		return "QueryVO [query=" + query + ", size=" + size + ", page=" + page + ", start=" + start + ", key=" + key
				+ "]";
	}
}