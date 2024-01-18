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
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("list", dao.list(vo));
		map.put("total", dao.total(vo));
		return map;
	}
	
	@Transactional
	@Override
	public HashMap<String, Object> read(int magazine_num) {
		dao.readCount(magazine_num);
		return dao.read(magazine_num);
	}

}
