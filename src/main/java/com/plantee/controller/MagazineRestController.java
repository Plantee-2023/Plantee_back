package com.plantee.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.google.firebase.auth.FirebaseAuthException;
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
	
	@GetMapping("/read/{magazine_num}") 
	public HashMap<String, Object> read(@PathVariable("magazine_num") int magazine_num) {
		return service.read(magazine_num);
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
	
	@GetMapping("/delete/{magazine_num}")
	public void delete(@PathVariable("magazine_num") int magazine_num) {
		dao.delete(magazine_num);
	}
	
	//이미지 업로드
	@PostMapping("/image")
	public void image(MagazineVO vo, MultipartHttpServletRequest multi) {
		MultipartFile file=multi.getFile("file");
		String path="/upload/magazine/";
		String fileName=System.currentTimeMillis() + ".jpg";
		try {
			file.transferTo(new File("c:" + path +fileName));
			vo.setImage(path + fileName);
			dao.image(vo);
			System.out.println("오류 :........... " + vo.toString());
		}catch(Exception e) {
			System.out.println("이미지변경:" + e.toString());
		}
	}
}
