package com.plantee.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantee.dao.MagazineDAO;
import com.plantee.domain.QueryVO;

@Service
public class MagazineServiceImpl implements MagazineService{
	@Autowired
	MagazineDAO dao;
	
	@Override
	public HashMap<String, Object> list(QueryVO vo,int page, int size, String key, String query) {
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("start",(page-1)*size);
		map.put("size", size);
		map.put("key", key);
		map.put("query", query);
		map.put("list", dao.list(vo));
		map.put("total", dao.total(vo));
		return map;
	}
}
