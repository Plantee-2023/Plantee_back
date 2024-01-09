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

   @Override
   public HashMap<String, Object> read(int diary_id) {
      return session.selectOne(namespace +".read", diary_id);
   }

   @Override
   public void insert(DiaryVO vo) {
	   session.insert(namespace +".read", vo);
	   
   }
   
   @Override
   public void update(DiaryVO vo) {
	   session.update(namespace +".read", vo);
	   
   }
	@Override
	public void delete(int diary_id) {
		session.delete(namespace + ".delete", diary_id);
	}


}

