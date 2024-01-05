package com.plantee.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantee.dao.DiaryDAO;
import com.plantee.domain.DiaryVO;

@RestController
@RequestMapping("/diary")
public class DiaryController {
	@Autowired
	DiaryDAO dao;
	
	@GetMapping("/list.json")
	public List<HashMap<String, Object>> list(DiaryVO vo) {
		return dao.list(vo);
	}
}
