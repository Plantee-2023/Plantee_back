package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import com.plantee.domain.ComentVO;
import com.plantee.domain.QueryVO;

public interface ComentDAO {
	
	public List<HashMap<String,Object>> c_list (  int post_id,QueryVO vo );
	public int c_total(int post_id);
	public void insert(ComentVO vo);
	public int read_id(String uid);
	public void update(ComentVO vo);
	public void delete(ComentVO vo);

}
