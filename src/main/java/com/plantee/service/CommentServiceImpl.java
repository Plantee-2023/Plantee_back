package com.plantee.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantee.dao.CommentsDAO;
 
import com.plantee.domain.QueryVO;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	CommentsDAO dao;

	@Override
	public HashMap<String, Object> list(int post_id,QueryVO vo) {
	 
 
			HashMap<String, Object> map=new HashMap<String, Object>();
			map.put("list", dao.c_list(post_id,vo));
			map.put("total", dao.c_total(post_id));
			return map;
		}
	}

	 
 
