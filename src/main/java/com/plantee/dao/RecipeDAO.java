package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import com.plantee.domain.QueryVO;

public interface RecipeDAO {
	public HashMap<String, Object> read(int recipe_id);
	public List<HashMap<String, Object>> list(QueryVO vo);
	public int total(QueryVO vo);
}
