package com.plantee.controller;

import java.io.File;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.plantee.dao.MagazineDAO;
import com.plantee.domain.MagazineVO;
import com.plantee.domain.QueryVO;
import com.plantee.service.MagazineService;

@RestController
@RequestMapping("/magazine")
public class MagazineRestController {
	@Autowired
	MagazineDAO dao;
	
	@Autowired
	MagazineService service;
	
	@GetMapping("/read/{post_id}") 
	public HashMap<String, Object> read(@PathVariable("post_id") int post_id) {
		return service.read(post_id);
	}
	
	@GetMapping("/list.json")
	public HashMap<String, Object> list(QueryVO vo) {
		return service.list(vo);
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody MagazineVO vo) {
		dao.insert(vo);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody MagazineVO vo) {
		dao.update(vo);
	}
	
	@GetMapping("/delete/{post_id}")
	public void delete(@PathVariable("post_id") int post_id) {
		dao.delete(post_id);
	}
	
	//이미지 업로드
	@PostMapping("/image")
	public void image(MagazineVO vo, MultipartHttpServletRequest multi) {
		MultipartFile file = multi.getFile("file");
		String path = "/upload/magazine/";
		String fileName = System.currentTimeMillis() + ".jpg";
		try {
			file.transferTo(new File("C:" + path + fileName));
			vo.setImage(path + fileName);
			dao.image(vo);
		} catch (Exception e) {
			System.out.println("이미지 변경 오류 : " + e.toString());
		}
	}
}
