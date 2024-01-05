package com.plantee.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantee.dao.DiaryDAO;
import com.plantee.domain.DiaryVO;

@RestController
@RequestMapping("/diary")
public class DiaryController {
   @Autowired
   DiaryDAO dao;
   
   @GetMapping("/list.json/{uid}")
   public List<HashMap<String, Object>> list(DiaryVO vo) {
      return dao.list(vo);
   }
   
   @GetMapping("/read/{diary_id}") 
   public HashMap<String, Object> read(@PathVariable("diary_id") int diary_id) {
      System.out.println("................." + diary_id);
      return dao.read(diary_id);
   }
}