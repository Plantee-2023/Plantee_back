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
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("page", vo.getPage());
		map.put("start",(vo.getPage()-1)*vo.getSize());
		map.put("size", vo.getSize());
		map.put("key", vo.getKey());
		map.put("query", vo.getQuery());
		return session.selectList(namespace + ".list", map);
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

	@Override
	public void readCount(int view_cnt) {
		session.update(namespace + ".readCount", view_cnt);
		
	}
	
}
