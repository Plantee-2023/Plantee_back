package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plantee.domain.ComentVO;
import com.plantee.domain.CommVO;
import com.plantee.domain.QueryVO;
import com.plantee.domain.UserVO;

@Repository
public class CommDAOImpl implements CommDAO {
	@Autowired
	SqlSession session;
	String namespace = "com.plantee.mapper.CommMapper";
	
	
	 

	@Override
	public void insert(CommVO vo) {
		session.insert(namespace + ".insert", vo);
		
	}

 	@Override
	 
		public List<HashMap<String, Object>> list(QueryVO vo ) {
 			
			return session.selectList(namespace + ".list", vo );
		 
	}
 	

 	

	@Override
	public List<HashMap<String, Object>> list2(QueryVO vo) {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".list2", vo );
	}
 
 	@Override
	public int total() {
		return session.selectOne(namespace + ".total");
	}

	@Override
	public String address1(String uid) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".address1",uid);
	}

	@Override
	public HashMap<String, Object> read(int post_id) {
		return session.selectOne(namespace + ".read", post_id);
	}

	@Override
	public void update(CommVO vo) {
		session.selectOne(namespace + ".update", vo);
		
	}

	@Override
	public void delete(CommVO vo) {
		session.selectOne(namespace + ".delete", vo);
		
	}

	
	
	
}