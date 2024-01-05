package com.plantee.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantee.dao.StoreDAO;
import com.plantee.domain.QueryVO;
import com.plantee.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreRestController {
	@Autowired
	StoreDAO dao;
	
	@Autowired
	StoreService service;
	
	@GetMapping("/read/{store_id}") 
	public HashMap<String, Object> read(@PathVariable("store_id") int store_id) {
		return dao.read(store_id);
	}
	
	@GetMapping("/list.json")
	public HashMap<String, Object> list(QueryVO vo) {
		return service.list(vo);
	}
	
	@GetMapping("/delete/{store_id}")
	public void delete(@PathVariable("store_id") int store_id) {
		dao.delete(store_id);
	}
	
}
