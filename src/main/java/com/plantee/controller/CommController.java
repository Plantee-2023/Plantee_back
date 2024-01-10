package com.plantee.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
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
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.google.api.Authentication;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.plantee.dao.CommDAO;
import com.plantee.domain.ComentVO;
import com.plantee.domain.CommVO;
import com.plantee.domain.QueryVO;
import com.plantee.domain.UserVO;
import com.plantee.service.FireBaseService;

@RestController
@RequestMapping("/comm")

public class CommController {
	

 
		@Autowired
		CommDAO dao;
		
		@Autowired
		FireBaseService service;
		
		

	 
		
		@GetMapping("/list.json")
		public HashMap<String,Object> list(QueryVO vo){
			HashMap<String,Object> map=new HashMap<String,Object>();
			vo.setStart((vo.getPage()-1) * vo.getSize());
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
		
		
		@GetMapping("/reply_total/{post_origin}")
		public int reply_total( @PathVariable("post_origin") int post_origin) {
			return dao.reply_total(post_origin);
		}
		
		
		
		@PostMapping("/insert")
		public void insert(@RequestBody CommVO vo) {
			dao.insert(vo);
		}
		
		
		
		@PostMapping("/insert_reply")
		public void insert_reply(@RequestBody CommVO vo) {
			dao.insert_reply(vo);
		}
		
		
		@PostMapping("/delete")
		public void delete(@RequestBody CommVO vo) {
			dao.delete(vo);
		}
	
		
		
		@PostMapping("/ckupload")
		public HashMap<String, Object> ckupload(MultipartHttpServletRequest multi ) {
		    HashMap<String, Object> map = new HashMap<String, Object>();

		    MultipartFile file = multi.getFile("upload");

		  String path = "/upload/plantee/"; 
		   
		    
		   // String path = Bucket.BucketSourceOption
		    File filePath = new File(path);

		    if (!filePath.exists()) {
		        filePath.mkdirs();  // mkdir() 대신 mkdirs()를 사용하여 하위 디렉토리도 생성
		    }

		    String fileName = System.currentTimeMillis() + ".jpg";
		    try {
		    	String url=service.uploadFiles(file, fileName);
		        file.transferTo(new File("c:" + path + fileName));
		        map.put("uploaded", 1);
		        map.put("url", url);
		        
		        
		        
		      
		        
		    } catch (Exception e) {
		        System.out.println("ckupload: " + e.toString());
		    }
		    return map;
		}
		
	 
	
	
		
			
		 
	    
		@PostMapping("/files")
		public String uploadFile(@RequestParam("file") MultipartFile file, String nameFile)
		throws IOException, FirebaseAuthException{
			if(file.isEmpty()) {
				return "is empty";
			}
			return service.uploadFiles(file, nameFile);
		}
		
	 
		
		@GetMapping("/api/candidates")
		 @ResponseBody
		public List<String> getCandidates() {
			return Arrays.asList("선택1", "선택2", "선택3");
	    }
		


}
