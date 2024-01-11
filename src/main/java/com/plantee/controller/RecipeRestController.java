package com.plantee.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantee.dao.RecipeDAO;
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
}
