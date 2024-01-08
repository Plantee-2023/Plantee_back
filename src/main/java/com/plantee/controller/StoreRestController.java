package com.plantee.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantee.dao.StoreDAO;
import com.plantee.domain.CommentsVO;
import com.plantee.domain.QueryVO;
import com.plantee.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreRestController {
	@Autowired
	StoreDAO dao;

	@Autowired
	StoreService service;

	@GetMapping("/list.json")
	public HashMap<String, Object> list(QueryVO vo) {
		return service.list(vo);
	}

	@GetMapping("/read/{store_id}")
	public HashMap<String, Object> read(@PathVariable("store_id") int store_id) {
		return dao.read(store_id);
	}

	@GetMapping("/delete/{store_id}")
	public void delete(@PathVariable("store_id") int store_id) {
		dao.delete(store_id);
	}
	

	// Comments
	@GetMapping("/review/{store_id}")
	public Map<String, Object> list(@PathVariable("store_id") int store_id) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("reviewList", dao.review_list(store_id));
		resultMap.put("reviewCount", dao.review_cnt(store_id));
		resultMap.put("starsCount", dao.stars_avg(store_id));
		return resultMap;
	}

	@GetMapping("/question/{store_id}")
	public Map<String, Object> question_list(@PathVariable("store_id") int store_id) {
		Map<String, Object> questionMap = new HashMap<String, Object>();
		
		CommentsVO cvo = new CommentsVO(); 
		cvo.setStore_id(store_id);
		cvo.setLvl(0);
		questionMap.put("questionList", dao.question_list(cvo));
		cvo.setLvl(1);
		questionMap.put("answerList", dao.question_list(cvo));
		questionMap.put("questionCount", dao.question_cnt(store_id));
		return questionMap;
	}

}
