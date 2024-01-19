package com.plantee.service;

import java.util.HashMap;

import com.plantee.domain.QueryVO;
import com.plantee.domain.VoteVO;

public interface CommService {

	public HashMap<String, Object> search_list(QueryVO vo);
	public HashMap<String,Object> read(int post_id, String uid);
	public void update_vote(VoteVO vo);
	public void insertFavorites(int post_id, String uid);
	public void deleteFavorites(int post_id, String uid);
	
	
	
}
