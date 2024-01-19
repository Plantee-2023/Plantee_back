package com.plantee.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.plantee.dao.CommDAO;

import com.plantee.domain.QueryVO;
import com.plantee.domain.VoteVO;

@Service
public class CommServiceImpl implements CommService {
	@Autowired
	CommDAO dao;

	@Override
	public HashMap<String, Object> search_list(QueryVO vo) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		vo.setStart((vo.getPage() - 1) * vo.getSize());

		map.put("list", dao.search_list(vo));
		map.put("total1", dao.total1(vo));
		return map;
	}

	@Transactional
	@Override
	public HashMap<String, Object> read(int post_id, String uid) {
		
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("read", dao.read(post_id, uid)); 
		map.put("mylikes",dao.mylikes(post_id, uid));
		map.put("show_vote", dao.show_vote(post_id));
		map.put("myvote", dao.myvote(uid,post_id));
		dao.viewcnt(post_id);
		 
		return map;
		
	}
	
	@Transactional
	@Override
	public void insertFavorites(int post_id, String uid) {
		dao.insertFavorites(post_id, uid);
		dao.updateFavorites(post_id, 1);
	}

	@Transactional
	@Override
	public void deleteFavorites(int post_id, String uid) {
		dao.deleteFavorites(post_id, uid);
		dao.updateFavorites(post_id, -1);
	}

	@Transactional
	@Override
	public void update_vote(VoteVO vo) {
		dao.update_votecnt(vo);
		dao.update_vote_result(vo);
		 
	 
		
	}
	
	

}
