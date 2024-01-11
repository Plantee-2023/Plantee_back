package com.plantee.controller;

import java.util.HashMap;
import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.plantee.dao.CommentsDAO;
import com.plantee.domain.QueryVO;

 


 

@RestController
@RequestMapping("/coment")


public class CommentsController {
	
	@Autowired
	CommentsDAO dao;
	
	@GetMapping("/c_list.json")
    public List<HashMap<String, Object>> c_list(@RequestParam(value="post_id") int post_id,QueryVO vo   ){
 
        return dao.c_list(post_id,vo  );
    }
	@GetMapping("/c_total")
	public int total(int post_id) {
		return dao.c_total(post_id);
	}
	
	
	 
	 

}
