package com.plantee.service;

import java.util.HashMap;

import com.plantee.domain.QueryVO;

public interface MagazineService {
	public HashMap<String, Object> list(QueryVO vo,int page, int size, String key, String query);
}
