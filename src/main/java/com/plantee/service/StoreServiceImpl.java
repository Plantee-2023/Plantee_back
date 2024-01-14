package com.plantee.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.plantee.dao.StoreDAO;
import com.plantee.domain.QueryVO;
import com.plantee.domain.StoreVO;

@Service
public class StoreServiceImpl implements StoreService {
	@Autowired
	StoreDAO dao;

	@Override
	public HashMap<String, Object> list(QueryVO vo) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("list", dao.list(vo));
		map.put("total", dao.total(vo));
		return map;
	}

	@Override
	public void insert(StoreVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void like(int user_id, int store_id) {
		dao.like(user_id, store_id);
		dao.update_like(1, user_id);
	}

	@Override
	public void delete_like(int user_id, int store_id) {
		dao.delete_like(user_id, store_id);
		dao.update_like(-1, user_id);
	}

	
	// Comments


}
