package com.plantee.service;

import java.util.HashMap;

import com.plantee.domain.CommentsVO;
import com.plantee.domain.QueryVO;

public interface RecipeService {
   public HashMap<String, Object> list(QueryVO vo);
   public void review_insert(CommentsVO vo);
   public void review_delete(int comment_id);
}