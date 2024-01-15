package com.plantee.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.plantee.dao.DiaryDAO;
import com.plantee.domain.DiaryVO;
import com.plantee.service.FireBaseService;

@RestController
@RequestMapping("/diary")
public class DiaryController {
   @Autowired
   DiaryDAO dao;
   
   @Autowired
	FireBaseService service;
   
   @GetMapping("/list.json/{uid}")
   public List<HashMap<String, Object>> list(DiaryVO vo) {
      return dao.list(vo);
   }
   
   @GetMapping("/read/{diary_id}") 
   public HashMap<String, Object> read(@PathVariable("diary_id") int diary_id) {
      return dao.read(diary_id);
   }
   
   @PostMapping("/insert")
	public void insert(@RequestBody DiaryVO vo) {
		dao.insert(vo);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody DiaryVO vo) {
		dao.update(vo);
	}
   
   @PostMapping("/delete/{diary_id}")
   public void delete(@PathVariable("diary_id") int diary_id) {
	   dao.delete(diary_id);
   }
   	
   @GetMapping("/storelist.json/{diary_id}")
   public List<HashMap<String, Object>> storelist(DiaryVO vo) {
      return dao.storelist(vo);
   }
}