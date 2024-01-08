package com.plantee.service;

import java.util.HashMap;

import com.plantee.domain.QueryVO;

public interface PlantService {
	public HashMap<String, Object> list(QueryVO vo);
}
