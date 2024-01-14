package com.plantee.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantee.dao.CartDAO;
import com.plantee.domain.CartVO;
import com.plantee.domain.UserVO;
import com.plantee.service.OrderService;

@RestController
@RequestMapping("/cart")
public class CartRestController {
	@Autowired
	CartDAO dao;
	
	@Autowired
	OrderService service;

	@GetMapping("/list")
	public HashMap<String, Object> list(UserVO vo) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("list", dao.list(vo));
		map.put("total", dao.total(vo.getUser_id()));
		map.put("sum", dao.sum(vo.getUser_id()));
		return map;
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody CartVO vo) {
		service.insert(vo);
	}
	
	@PostMapping("/delete/{cid}")
	public void delete(@PathVariable int cid) {
		dao.delete(cid);
	}
	
	@PostMapping("/update/qnt")
	public void updateQnt(@RequestBody CartVO vo) {
		dao.updateQnt(vo);
	}
}
