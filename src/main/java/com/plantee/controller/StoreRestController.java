package com.plantee.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.plantee.dao.StoreDAO;
import com.plantee.domain.CommentsVO;
import com.plantee.domain.QueryVO;
import com.plantee.domain.StoreVO;
import com.plantee.domain.UserVO;
import com.plantee.service.FireBaseService;
import com.plantee.service.StoreService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/store")
public class StoreRestController {
	@Autowired
	StoreDAO dao;

	@Autowired
	StoreService service;

	@Autowired
	FireBaseService fbserv;

	@GetMapping("/list.json")
	public HashMap<String, Object> list(QueryVO vo) {
		return service.list(vo);
	}
	
	@GetMapping("/getUserInfoAct")
	public HashMap<String, Object> getUserInfoAct(QueryVO vo) {
		return dao.getUserInfo(vo);
	}

	@GetMapping("/read/{store_id}")
	public HashMap<String, Object> read(@PathVariable("store_id") int store_id) {
		return dao.read(store_id);
	}

	@GetMapping("/delete/{store_id}")
	public void delete(@PathVariable("store_id") int store_id) {
		dao.delete(store_id);
	}

	@PostMapping("/insert")
	public void insert(@RequestBody StoreVO vo) {
		dao.insert(vo);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody StoreVO vo) {
		dao.update(vo);
	}

	@PostMapping("/ckupload")
	public HashMap<String, Object> ckupload(MultipartHttpServletRequest multi) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		MultipartFile file = multi.getFile("upload");
		String path = "/upload/plantee/";
		File filePath = new File(path);
		if (!filePath.exists()) {
			filePath.mkdirs(); // mkdir() 대신 mkdirs()를 사용하여 하위 디렉토리도 생성
		}
		String fileName = System.currentTimeMillis() + ".jpg";
		try {
			String url = fbserv.uploadFiles(file, fileName);
			file.transferTo(new File("c:" + path + fileName));
			map.put("uploaded", 1);
			map.put("url", url);
		} catch (Exception e) {
			System.out.println("ckupload: " + e.toString());
		}
		return map;
	}
	
	@PostMapping("/image")
	public void image(StoreVO vo, MultipartHttpServletRequest multi) {
		MultipartFile file = multi.getFile("file");
		String path = "/upload/plantee/";
		String fileName = System.currentTimeMillis() + ".jpg";
		try {
			file.transferTo(new File("c:" + path + fileName));
			vo.setImage(path + fileName);
			dao.image(vo);
		} catch (Exception e) {
			System.out.println("이미지변경 : " + e.toString());
		}
	}
	
	// like
	@GetMapping("/insert/like")
	public void like(int user_id, int store_id) {
		service.like(user_id, store_id);
	}
	
	@GetMapping("/delete/like")
	public void delete_like(int user_id, int store_id) {
		service.delete_like(user_id, store_id);
	}
	
	

	@GetMapping("/count")
	public void count(UserVO vo) {
		dao.count(vo);
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
	
	// Comments
	@PostMapping("/reviewOne")
	public Map<String, Object> reviewOne(@RequestBody CommentsVO vo) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap = dao.review_one(vo);
//		resultMap.put("reviewList", );
//		resultMap.put("reviewCount", dao.review_cnt(store_id));
//		resultMap.put("starsCount", dao.stars_avg(store_id));
		return resultMap;
	}
	
	@PostMapping("/comment/insert")
	public void review_insert(@RequestBody CommentsVO vo) {
		dao.review_insert(vo);
	}
	
	@PostMapping("/comment/update")
	public void review_update(@RequestBody CommentsVO vo) {
		dao.review_update(vo);
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
	
	@GetMapping("/delete/comment/{comment_id}")
	public void delete_comment(@PathVariable("comment_id") int comment_id) {
		dao.delete_comment(comment_id);
	}

}
