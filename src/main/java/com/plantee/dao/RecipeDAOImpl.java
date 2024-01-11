package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plantee.domain.QueryVO;
import com.plantee.domain.RecipeVO;

@Repository
public class RecipeDAOImpl implements RecipeDAO {
	
	@Autowired
	SqlSession session;
	String namespace = "com.plantee.mapper.RecipeMapper";

	@Override
	public HashMap<String, Object> read(int recipe_id) {
		return session.selectOne(namespace +".read", recipe_id);
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
	public void insert(RecipeVO vo) {
		session.insert(namespace + ".insert", vo);
	}
	
	@Override
	public void update(RecipeVO vo) {
		session.update(namespace + ".update", vo);
		
	}

	@Override
	public void delete(int recipe_id) {
		session.delete(namespace + ".delete", recipe_id);
	}
}
