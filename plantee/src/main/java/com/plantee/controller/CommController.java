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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.plantee.dao.CommDAO;
import com.plantee.domain.CommVO;
import com.plantee.domain.QueryVO;

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
		
 
		
		 
		
		
		@PostMapping("/insert")
		public void insert(@RequestBody CommVO vo) {
			dao.insert(vo);
		}
		
		
		@PostMapping("/ckupload/{post_id}")
		public HashMap<String, Object> ckupload(@PathVariable int pid, MultipartHttpServletRequest multi){
			HashMap<String, Object> map=new HashMap<String, Object>();
			MultipartFile file=multi.getFile("upload");
			
			String path="/upload/shop/" + pid + "/";
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
		


}
