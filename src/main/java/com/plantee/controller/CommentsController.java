package com.plantee.controller;

import java.util.HashMap;
import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.plantee.dao.CommentsDAO;
import com.plantee.domain.CommVO;
import com.plantee.domain.CommentsVO;
import com.plantee.domain.QueryVO;
import com.plantee.service.CommentService;
import com.plantee.service.PlantService;

 


 

@RestController
@RequestMapping("/comments")


public class CommentsController {
	
	@Autowired
	CommentsDAO dao;

	@Autowired
	CommentService service;
	
	
	@GetMapping("/c_list.json")
    public HashMap<String, Object> list(@RequestParam(value="post_id") int post_id,QueryVO vo   ){
 
        return service.list(post_id,vo);
    }
	
	
	
	@GetMapping("/c_total")
	public int total(int post_id) {
		return dao.c_total(post_id);
	}
	
	
	@GetMapping("/read_id")
	public int read_id(@RequestParam(value="uid") String uid) {
		return dao.read_id(uid);
	}
	
	
	
	@PostMapping("/insert_comments")
	public void insert( @RequestBody CommentsVO vo) {

		dao.insert_comments(vo);
	}

	
	
	@PostMapping("/delete_comments/{comment_id}")
	public void delete_comments( @PathVariable("comment_id") int comment_id) {

		dao.delete_comments(comment_id);
	}
	
}
