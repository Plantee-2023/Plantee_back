package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plantee.domain.CommentsVO;
import com.plantee.domain.QueryVO;
 

@Repository
public class CommentsDAOImpl implements CommentsDAO  {
	
	@Autowired
	SqlSession session;
	String namespace="com.plantee.mapper.CommentsMapper";
	
	
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
	public int read_id(String uid) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".read_id",uid);
	}
	
	@Override
	public void insert_comments(CommentsVO vo) {
		
	 

		session.insert(namespace + ".insert_comments",vo);
		
	}
	
	@Override
	public void delete_comments(int comment_id) {
	 

		session.delete(namespace + ".delete",comment_id);
		
	}
	
	

}
