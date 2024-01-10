package com.plantee.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantee.dao.RecipeDAO;
import com.plantee.domain.QueryVO;

@Service
public class RecipeServiceImpl implements RecipeService {

	@Autowired
	RecipeDAO dao;

	@Override
	public HashMap<String, Object> list(QueryVO vo) {
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("list", dao.list(vo));
		map.put("total", dao.total(vo));
		return map;
	}

}
