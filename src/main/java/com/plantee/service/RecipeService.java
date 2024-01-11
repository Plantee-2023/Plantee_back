package com.plantee.service;

import java.util.HashMap;

import com.plantee.domain.QueryVO;
import com.plantee.domain.RecipeVO;

public interface RecipeService {
	public HashMap<String, Object> list(QueryVO vo);
	//public void insert(RecipeVO vo);
}
