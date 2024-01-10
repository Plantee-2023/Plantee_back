package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plantee.domain.MagazineVO;
import com.plantee.domain.QueryVO;

@Repository
public class MagazineDAOImpl implements MagazineDAO{
	@Autowired
	SqlSession session;
	
	String namespace="com.plantee.mapper.MagazineMapper";
	
	@Override
	public List<HashMap<String, Object>> list(QueryVO vo) {
		return session.selectList(namespace + ".list", vo);
	}

	@Override
	public HashMap<String, Object> read(int post_id) {
		return session.selectOne(namespace +".read", post_id);
	}

	@Override
	public int total(QueryVO vo) {
		return session.selectOne(namespace + ".total", vo);
	}

	@Override
	public void insert(MagazineVO vo) {
		session.insert(namespace + ".insert", vo);
		
	}

	@Override
	public void update(MagazineVO vo) {
		session.update(namespace + ".update", vo);
		
	}

	@Override
	public void delete(int post_id) {
		session.delete(namespace + ".delete", post_id);
		
	}

	@Override
	public void updateImage(MagazineVO vo) {
		session.update(namespace + ".updateImage",vo);
		
	}
	
}
