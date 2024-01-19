package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import com.plantee.domain.CommVO;
import com.plantee.domain.QueryVO;
import com.plantee.domain.VoteVO;

public interface CommDAO {
	
	 
	public List<HashMap<String,Object>> reply_list (QueryVO vo,int category, int filter);
	public List<HashMap<String,Object>> filter_list (QueryVO vo,int category, int filter);
	public List<HashMap<String,Object>> search_list (QueryVO vo);
	public List<HashMap<String,Object>> show_vote (int post_id);
	public int mylikes(int post_id,String uid); 
	public HashMap<String,Object> myvote(String uid,int post_id);
	public void insert(CommVO vo) ;
	public void insert_reply(CommVO vo) ;
	public void vote_insert(VoteVO vo);
	public void update_vote_result(VoteVO vo);
	public void update_votes(VoteVO vo);
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
	public void update_votecnt(VoteVO vo);
	public void deleteFavorites(int post_id, String uid);
	public void updateFavorites(int post_id, int amount);
	
	
	
}