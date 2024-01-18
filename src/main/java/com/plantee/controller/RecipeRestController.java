package com.plantee.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantee.dao.CommentsDAO;
import com.plantee.dao.RecipeDAO;
import com.plantee.domain.CommentsVO;
import com.plantee.domain.PlantVO;
import com.plantee.domain.QueryVO;
import com.plantee.domain.RecipeVO;
import com.plantee.service.RecipeService;

@RestController
@RequestMapping("/recipe")
public class RecipeRestController {
	
	@Autowired
	RecipeDAO dao;
	
	@Autowired
	CommentsDAO cdao;
	
	@Autowired
	RecipeService service;
	
	@GetMapping("/read/{recipe_id}") 
	public HashMap<String, Object> read(@PathVariable("recipe_id") int recipe_id) {
		System.out.println("....." + recipe_id);
		return dao.read(recipe_id);
	}
	
	@GetMapping("/list.json")
	public HashMap<String, Object> list(QueryVO vo) {
		return service.list(vo);
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody RecipeVO vo) {
		dao.insert(vo);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody RecipeVO vo) {
		dao.update(vo);
	}
	
	@GetMapping("/delete/{recipe_id}")
	public void delete(@PathVariable("recipe_id") int recipe_id) {
		dao.delete(recipe_id);
	}
	
	/* Comments */
	@GetMapping("/review/{recipe_id}")
	public HashMap<String, Object> review_list(@PathVariable("recipe_id") String recipe_id){
		System.out.println("controller!!");
	    HashMap<String, Object> map = new HashMap<String, Object>();
	    map.put("reviewtotal", dao.review_total(Integer.parseInt(recipe_id)));
	    map.put("reviewlist", dao.review_list(Integer.parseInt(recipe_id))); //String -> int
	    return map;
	}
	
	@PostMapping("/review/insert")
	public void review_insert(@RequestBody CommentsVO vo) {
		dao.review_insert(vo);
	}
	
	@PostMapping("/review/delete/{comment_id}")
	public void review_delete(@PathVariable("comment_id") int comment_id) {
		dao.review_delete(comment_id);
	}
	
	@PostMapping("/review/uppdate")
	public void review_update(@RequestBody CommentsVO vo) {
		dao.review_update(vo);
	}
}
