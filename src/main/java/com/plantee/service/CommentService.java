package com.plantee.service;

 

 
import java.util.HashMap;

 
import com.plantee.domain.QueryVO;
 
public interface CommentService {
 
 
	public HashMap<String,Object>list(int post_id,QueryVO vo);
 

	

}
