package com.plantee.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantee.dao.PlantDAO;
import com.plantee.domain.PlantVO;
import com.plantee.domain.QueryVO;
import com.plantee.service.PlantService;
@RestController
@RequestMapping("/plant")
public class PlantRestController {
	@Autowired
	PlantDAO dao;
	
	@Autowired
	PlantService service;
	
	@GetMapping("/read/{plant_id}") 
	public HashMap<String, Object> read(@PathVariable("plant_id") int plant_id) {
		System.out.println("....." + plant_id);
		return dao.read(plant_id);
	}
	
	@GetMapping("/list.json")
	public HashMap<String, Object> list(QueryVO vo) {
		return service.list(vo);
	}
}
