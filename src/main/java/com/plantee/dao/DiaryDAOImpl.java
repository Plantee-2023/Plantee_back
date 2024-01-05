package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plantee.domain.DiaryVO;

@Repository
public class DiaryDAOImpl implements DiaryDAO{
	@Autowired
	SqlSession session;
	String namespace = "com.plantee.mapper.DiaryMapper";
	
	@Override
	public List<HashMap<String, Object>> list(DiaryVO vo) {
		return session.selectList(namespace + ".list", vo);
	}

}
