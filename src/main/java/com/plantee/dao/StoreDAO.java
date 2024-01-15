package com.plantee.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.plantee.domain.CommentsVO;
import com.plantee.domain.QueryVO;
import com.plantee.domain.StoreVO;
import com.plantee.domain.UserVO;

public interface StoreDAO {
	
	//get user info
	public HashMap<String, Object> getUserInfo(QueryVO vo);
	
	public List<HashMap<String, Object>> list(QueryVO vo);
	public HashMap<String, Object> read(int store_id);
	public int total(QueryVO vo);
	public void delete(int store_id);
	public void insert(StoreVO vo);
	public void update(StoreVO vo);
	public void image(StoreVO vo);
	
	public void like(int user_id, int store_id);
	public void update_like(int store_id, int amount);
	public void delete_like(int user_id, int store_id);
	
	public int count(UserVO vo);
	
	// Comments
	public List<Map<String, Object>> review_list(int store_id);
	public int review_cnt(int store_id);
	public int stars_avg(int store_id);
	public void review_insert(CommentsVO vo);
	public List<Map<String, Object>> question_list(CommentsVO vo);
	public int question_cnt(int store_id);
	
	public void delete_comment(int comment_id);
	
	
	
}