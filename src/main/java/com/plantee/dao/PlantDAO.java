package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import com.plantee.domain.QueryVO;

public interface PlantDAO {
	public HashMap<String, Object> read(int plant_id);
	public List<HashMap<String, Object>> list(QueryVO vo);
	public int total(QueryVO vo);
}
