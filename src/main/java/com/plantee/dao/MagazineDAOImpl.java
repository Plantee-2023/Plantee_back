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
		vo.setStart((vo.getPage() - 1) * vo.getSize());
		return session.selectList(namespace + ".list", vo);
	}

	@Override
	public HashMap<String, Object> read(int magazine_num) {
		return session.selectOne(namespace +".read", magazine_num);
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
	public void delete(int magazine_num) {
		session.delete(namespace + ".delete", magazine_num);
		
	}

	@Override
	public void readCount(int view_cnt) {
		session.update(namespace + ".readCount", view_cnt);
		
	}

	@Override
	public void image(MagazineVO vo) {
		session.update(namespace + ".image", vo);
		
	}
}
