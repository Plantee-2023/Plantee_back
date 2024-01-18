package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import com.plantee.domain.CommVO;
import com.plantee.domain.QueryVO;

public interface CommDAO {
	
	 
	public List<HashMap<String,Object>> reply_list (QueryVO vo,int category, int filter);
	public List<HashMap<String,Object>> filter_list (QueryVO vo,int category, int filter);
	public List<HashMap<String,Object>> search_list (QueryVO vo);
	
	public void insert(CommVO vo) ;
	public void insert_reply(CommVO vo) ;
	
	public void delete(CommVO vo) ;
	
	public void update(CommVO vo) ;
	public void viewcnt(int post_id);
	
	public int total(QueryVO vo, int category,int filter);
	public int total1(QueryVO vo  );
	public int reply_total(int post_origin);
	public String address1(String uid );
	public HashMap<String,Object> read(int post_id); 
	public HashMap<String, Object> read(int post_id, String uid);
	
	
	
	public void insertFavorites(int post_id, String uid);
	public void deleteFavorites(int post_id, String uid);
	public void updateFavorites(int post_id, int amount);
	
	
	
}