package com.plantee.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.plantee.dao.CommentsDAO;
import com.plantee.dao.RecipeDAO;
import com.plantee.domain.CommentsVO;
import com.plantee.domain.QueryVO;

@Service
public class RecipeServiceImpl implements RecipeService {

   @Autowired
   RecipeDAO dao;
   
   @Autowired
   CommentsDAO cdao;
   

   @Override
   public HashMap<String, Object> list(QueryVO vo) {
      HashMap<String, Object> map=new HashMap<String, Object>();
      map.put("list", dao.list(vo));
      map.put("total", dao.total(vo));
      return map;
   }


   @Override
   public void review_insert(CommentsVO vo) {
      dao.review_insert(vo);
   }


   @Override
   public void review_delete(int comment_id) {
      dao.review_delete(comment_id);
   }
}