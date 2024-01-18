package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import com.plantee.domain.CommentsVO;
import com.plantee.domain.QueryVO;
import com.plantee.domain.RecipeVO;

public interface RecipeDAO {
	public HashMap<String, Object> read(int recipe_id);
	public List<HashMap<String, Object>> list(QueryVO vo);
	public int total(QueryVO vo);
	public void insert(RecipeVO vo);
	public void update(RecipeVO vo);
	public void delete(int recipe_id);
	
	public List<HashMap<String, Object>> review_list(int recipe_id);
	public void review_insert(CommentsVO vo);
	public void review_delete(int comment_id);
	public void review_update(CommentsVO vo);
	public int review_total(int recipe_id);
//	public void review_updatelcnt(int comment_id, int amount);
}
