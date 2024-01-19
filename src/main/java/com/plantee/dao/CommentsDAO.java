package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import com.plantee.domain.CommentsVO;
import com.plantee.domain.QueryVO;

public interface CommentsDAO {
	
	public List<HashMap<String,Object>> c_list (int post_id,QueryVO vo );
	public int c_total(int post_id);
	public int read_id(String uid);
	public void insert_comments(CommentsVO vo);
	public void delete_comments(int comments_id);
	public void update_comments(CommentsVO vo);
	
}
