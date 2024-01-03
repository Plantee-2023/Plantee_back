package com.plantee.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantee.dao.StoreDAO;

@RestController
@RequestMapping("/store")
public class ShopRestController {
	@Autowired
	StoreDAO dao;
	
	@GetMapping("/read.json/{store_id}") // 관리자용
	public HashMap<String, Object> read(@PathVariable("store_id") int store_id) {
		System.out.println("................." + store_id);
		return dao.read(store_id);
	}
	
}
