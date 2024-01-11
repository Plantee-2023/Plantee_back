package com.plantee.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;

import com.plantee.dao.MagazineDAO;
import com.plantee.domain.MagazineVO;
import com.plantee.domain.QueryVO;

@Service
public class MagazineServiceImpl implements MagazineService{
	@Autowired
	MagazineDAO dao;
	
	@Override
	public HashMap<String, Object> list(QueryVO vo) {
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("page", vo.getPage());
		map.put("start",(vo.getPage()-1)*vo.getSize());
		map.put("size", vo.getSize());
		map.put("key", vo.getKey());
		map.put("query", vo.getQuery());
		map.put("list", dao.list(vo));
		map.put("total", dao.total(vo));
		return map;
	}
	
	@Transactional
	@Override
	public HashMap<String, Object> read(int post_id) {
		dao.readCount(post_id);
		return dao.read(post_id);
	}

}
