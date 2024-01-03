package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plantee.domain.QueryVO;
import com.plantee.domain.StoreVO;

@Repository
public class StoreDAOImpl implements StoreDAO {
	
	@Autowired
	SqlSession session;
	String namespace = "com.plantee.mapper.StoreMapper";

	@Override
	public HashMap<String, Object> read(int store_id) {
		return session.selectOne(namespace +".read", store_id);
	}

	@Override
	public int total(QueryVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<HashMap<String, Object>> list(QueryVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(StoreVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(StoreVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void image(StoreVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int store_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void like(int user_id, int store_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update_like(int store_id, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete_like(int user_id, int store_id) {
		// TODO Auto-generated method stub
		
	}

	

}
