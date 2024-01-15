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

import com.plantee.dao.UserDAO;
import com.plantee.domain.UserVO;

@RestController
@RequestMapping("/users")
public class UserRestController {
	@Autowired
	UserDAO dao;

	@GetMapping("/read.json/{uid}") // localhost:8080/users/read.json/red
	public HashMap<String, Object> read(@PathVariable("uid") String uid) {
		//System.out.println("................." + uid);
		return dao.read(uid);
	}

	@PostMapping("/login")
	public int login(@RequestBody UserVO vo) {
		int result = 0;
		UserVO user = dao.login(vo.getUid());
		if (user != null) {
			if (vo.getUpass().equals(user.getUpass())) {
				result = 1;
			} else {
				result = 2;
			}
		}
		return result;
	}

	@PostMapping("/insert")
	public void insert(@RequestBody UserVO vo) {
		// System.out.println(vo.toString());
		dao.insert(vo);
	}

	@PostMapping("/update")
	public void update(@RequestBody UserVO vo) {
		// System.out.println(vo.toString());
		dao.update(vo);
	}

	@PostMapping("/password")
	public void password(@RequestBody UserVO vo) {
		dao.password(vo);
	}

	@PostMapping("/delete/{user_id}")
	   public void delete(@PathVariable("user_id") int user_id) {
		   dao.delete(user_id);
	}
	
	@PostMapping("/upload")
	public void upload(String uid, MultipartHttpServletRequest multi) throws Exception {
		MultipartFile file = multi.getFile("file");
		String filePath = "/upload/photo/";
		String fileName = System.currentTimeMillis() + ".jpg";
		file.transferTo(new File("c:" + filePath + fileName));
		UserVO vo = new UserVO();
		vo.setUid(uid);
		vo.setImage(filePath + fileName);
		dao.image(vo);
	}
}