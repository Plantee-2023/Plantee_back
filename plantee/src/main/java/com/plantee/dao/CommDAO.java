package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import com.plantee.domain.CommVO;
import com.plantee.domain.QueryVO;

public interface CommDAO {
	
	public List<HashMap<String,Object>> list (QueryVO vo);
	public void insert(CommVO vo) ;
	public int total();

}
