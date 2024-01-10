package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plantee.domain.ComentVO;
import com.plantee.domain.QueryVO;
 

@Repository
public class ComentDAOImpl implements ComentDAO  {
	
	@Autowired
	SqlSession session;
	String namespace="com.plantee.mapper.ComentMapper";
	
	
 	@Override
	 
	public List<HashMap<String, Object>> c_list(int post_id,QueryVO vo ) {
 		HashMap<String, Object> map=new HashMap<>();
		map.put("post_id",post_id);
		map.put("start",(vo.getPage()-1)*vo.getSize());
		map.put("size",vo.getSize());
		 
		return session.selectList(namespace + ".c_list", map );
	 
}
	@Override
	public int c_total(int post_id) {
		return session.selectOne(namespace + ".c_total",post_id);
	}
	@Override
	public void insert(ComentVO vo) {

		session.insert(namespace + ".insert", vo);
		
	}
	
 
	
	 
	@Override
	public int read_id(String uid) {
		return session.selectOne(namespace + ".read_id",uid);
		
	}
	 
	@Override
	public void update(ComentVO vo) {
		session.update(namespace + ".update", vo);
	}
	
	@Override
	public void delete(ComentVO vo) {
		session.delete(namespace + ".delete", vo);
	}

	
	

}
