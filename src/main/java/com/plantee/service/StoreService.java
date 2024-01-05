package com.plantee.service;

import java.util.HashMap;

import com.plantee.domain.QueryVO;
import com.plantee.domain.StoreVO;

public interface StoreService {
	public HashMap<String, Object> list(QueryVO vo);
	public void insert(StoreVO vo);
	
	public void like(int user_id, int store_id);
	public void delete_like(int user_id, int store_id);
}
