package com.plantee.service;

import java.util.HashMap;

import com.plantee.domain.QueryVO;

public interface RecipeService {
	public HashMap<String, Object> list(QueryVO vo);
}
