package com.plantee.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plantee.domain.CommentsVO;
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

   /* Comments */

   @Override
   public List<HashMap<String, Object>> review_list(int recipe_id) {
      HashMap<String, Object> map = new HashMap<>();
      map.put("recipe_id", recipe_id);
      return session.selectList(namespace + ".review_list", map);
   }

   @Override
   public void review_insert(CommentsVO vo) {
      session.insert(namespace + ".review_insert", vo);
   }

   @Override
   public void review_delete(int comment_id) {
      session.delete(namespace + ".review_delete", comment_id);
   }

   @Override
   public int review_total(int recipe_id) {
      return session.selectOne(namespace + ".review_total", recipe_id);
   }

   @Override
   public void review_update(CommentsVO vo) {
      session.update(namespace + ".review_update", vo);
   }

//   @Override
//   public void review_updatelcnt(int comment_id, int amount) {
//      HashMap<String, Object> map = new HashMap<>();
//      map.put("comment_id", comment_id);
//      map.put("amount", amount);
//      session.update(namespace + ".review_updatelcnt", map)
//   }
}