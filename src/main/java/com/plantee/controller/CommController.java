package com.plantee.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.plantee.dao.CommDAO;
import com.plantee.domain.ComentVO;
import com.plantee.domain.CommVO;
import com.plantee.domain.QueryVO;
import com.plantee.domain.UserVO;

@RestController
@RequestMapping("/comm")

public class CommController {
	

 
		@Autowired
		CommDAO dao;
		
		
		@GetMapping("/list.json")
		public HashMap<String,Object> list(QueryVO vo){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("list", dao.list(vo));
			map.put("total", dao.total());
			 
			return map;
		}
		
		
		@GetMapping("/list2.json")
		public HashMap<String,Object> list2(QueryVO vo){
			HashMap<String,Object> map=new HashMap<String,Object>();
			map.put("list", dao.list2(vo));
			map.put("total", dao.total());
			 
			return map;
		}
		
		
	
		
	 
		
		@PostMapping("/update")
		public void update(@RequestBody CommVO vo) {
			dao.update(vo);
		}
		
		
		
 
		@GetMapping("/read.json/{post_id}")
		public HashMap<String,Object> read(@PathVariable("post_id") int post_id){
			return dao.read(post_id);
		}
		
		
		@PostMapping("/insert")
		public void insert(@RequestBody CommVO vo) {
			dao.insert(vo);
		}
		
		
		@PostMapping("/delete")
		public void delete(@RequestBody CommVO vo) {
			dao.delete(vo);
		}
		
		
		@PostMapping("/ckupload")
		public HashMap<String, Object> ckupload( MultipartHttpServletRequest multi){
			HashMap<String, Object> map=new HashMap<String, Object>();
			MultipartFile file=multi.getFile("upload");
			
			String path="/upload/plantee/" ;
			File filePath=new File(path);
			if(!filePath.exists()) filePath.mkdir();
			
			String fileName=System.currentTimeMillis() + ".jpg";
			try {
				file.transferTo(new File("c:" + path +fileName));
				map.put("uploaded", 1);
				map.put("url", "/display?file=" + path + fileName);
			}catch(Exception e) {
				System.out.println("ckupload:" + e.toString());
			}
			return map;
		}
		
		@GetMapping("/display")
		public ResponseEntity<Resource> display(String file) {
			Resource resource = new FileSystemResource("c:" + file);
			if (!resource.exists())
				return new ResponseEntity<Resource>(HttpStatus.NOT_FOUND);
			HttpHeaders header = new HttpHeaders();
			try {
				Path filePath = Paths.get("c:" + file);
				header.add("Content-type", Files.probeContentType(filePath));
			} catch (Exception e) {
				System.out.println("오류:" + e.toString());
			}
			return new ResponseEntity<Resource>(resource, header, HttpStatus.OK);
		}
		
 
		@ResponseBody
		@GetMapping("/deleteFile")
		public void deleteFile(String file) {
			new File("c:/" + file).delete();
		}
		
		
		@GetMapping("/api/candidates")
		 @ResponseBody
		public List<String> getCandidates() {
			return Arrays.asList("선택1", "선택2", "선택3");
	    }
		


}
