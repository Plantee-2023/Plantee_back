package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import com.plantee.domain.ComentVO;
import com.plantee.domain.CommVO;
import com.plantee.domain.QueryVO;
 

public interface CommDAO {
	
	public List<HashMap<String,Object>> list (QueryVO vo );
	public List<HashMap<String,Object>> list2 (QueryVO vo );

	public void insert(CommVO vo) ;
	public void insert_reply(CommVO vo) ;
	
	public void delete(CommVO vo) ;
	public void update(CommVO vo) ; 
	
	public int total();
	public int reply_total(int post_origin);
	public String address1(String uid );
	public HashMap<String,Object> read(int post_id); 
	
}
