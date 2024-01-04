package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plantee.domain.CommVO;
import com.plantee.domain.QueryVO;

@Repository
public class CommDAOImpl implements CommDAO {
	@Autowired
	SqlSession session;
	String namespace = "com.example.mapper.CommMapper";
	
	
	 

	@Override
	public void insert(CommVO vo) {
		session.insert(namespace + ".insert", vo);
		
	}

 	@Override
	 
		public List<HashMap<String, Object>> list(QueryVO vo) {
			return session.selectList(namespace + ".list", vo);
		 
	}
 
 	@Override
	public int total() {
		return session.selectOne(namespace + ".total");
	}
	
	
	
}