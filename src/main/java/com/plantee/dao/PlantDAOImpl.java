package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plantee.domain.PlantVO;
import com.plantee.domain.QueryVO;

@Repository
public class PlantDAOImpl implements PlantDAO {

	@Autowired
	SqlSession session;
	String namespace = "com.plantee.mapper.PlantMapper";

	@Override
	public HashMap<String, Object> read(int plant_id) {
		return session.selectOne(namespace +".read", plant_id);
	}

	@Override
	public List<HashMap<String, Object>> list(QueryVO vo) {
		return session.selectList(namespace + ".list", vo);
	}

	@Override
	public int total(QueryVO vo) {
		return session.selectOne(namespace + ".total", vo);
	}

	@Override
	public void insert(PlantVO vo) {
		session.insert(namespace + ".insert", vo);
	}

	@Override
	public void update(PlantVO vo) {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(int plant_id) {
		session.delete(namespace + ".delete", plant_id);
	}

}
