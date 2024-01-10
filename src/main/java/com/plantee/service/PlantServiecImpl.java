package com.plantee.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.plantee.dao.PlantDAO;
import com.plantee.domain.PlantVO;
import com.plantee.domain.QueryVO;

import jakarta.websocket.server.ServerEndpoint;

@Service
public class PlantServiecImpl implements PlantService {
	
	@Autowired
	PlantDAO dao;

	@Override
	public HashMap<String, Object> list(QueryVO vo) {
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("list", dao.list(vo));
		map.put("total", dao.total(vo));
		return map;
	}

}
