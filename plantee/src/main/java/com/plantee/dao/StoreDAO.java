package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import com.plantee.domain.QueryVO;
import com.plantee.domain.StoreVO;

public interface StoreDAO {
	public HashMap<String, Object> read(int store_id);
	public int total(QueryVO vo);
	public List<HashMap<String, Object>> list(QueryVO vo);
	public void insert(StoreVO vo);
	public void update(StoreVO vo);
	public void image(StoreVO vo);
	public void delete(int store_id);
	
	public void like(int user_id, int store_id);
	public void update_like(int store_id, int amount);
	public void delete_like(int user_id, int store_id);
}