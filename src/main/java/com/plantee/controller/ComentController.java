package com.plantee.controller;

import java.util.HashMap;
import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.plantee.dao.ComentDAO;
import com.plantee.domain.ComentVO;
import com.plantee.domain.QueryVO;
import com.plantee.service.CommentService;

 


 

@RestController
@RequestMapping("/coment")


public class ComentController {
	
	@Autowired
	ComentDAO dao;
	
	@Autowired
	CommentService service;
	
	@GetMapping("/c_list.json")
    public HashMap<String, Object> c_list(@RequestParam(value="post_id") int post_id,QueryVO vo   ){
		
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("c_list", dao.c_list(post_id,vo));
		map.put("c_total", dao.c_total(post_id));
 
        return map;
    }
	
	
	@GetMapping("/c_total")
	public int total(int post_id) {
		return dao.c_total(post_id);
	}
	
	@GetMapping("/read_id")
	
	public int read_id(@RequestParam(value="uid") String uid) {
		return dao.read_id(uid);
	}
	
	
 
	
	//리뷰등록
	@PostMapping("/insert")
	public void insert(@RequestBody ComentVO vo) {
		 
		dao.insert(vo);
		 
	}
	
	
	@PostMapping("/update")
	public void update(@RequestBody ComentVO vo) {
		dao.update(vo);
	}
	
	@PostMapping("/delete/")
	public void delete(@RequestBody ComentVO vo) {
		dao.delete(vo);
	}

	 
 
}
