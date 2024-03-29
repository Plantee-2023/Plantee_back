package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plantee.domain.CommVO;
import com.plantee.domain.QueryVO;
import com.plantee.domain.VoteVO;

@Repository
public class CommDAOImpl implements CommDAO {
	@Autowired
	SqlSession session;
	String namespace = "com.plantee.mapper.CommMapper";

	@Override
	public void insert(CommVO vo) {
		session.insert(namespace + ".insert", vo);

	}

	@Override
	public void insert_reply(CommVO vo) {
		session.insert(namespace + ".insert_reply", vo);
	}
	
	@Override

	public List<HashMap<String, Object>> search_list(QueryVO vo) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("query", vo.getQuery());
		map.put("size", vo.getSize());
		map.put("page", vo.getPage());
		map.put("start", vo.getStart());
		map.put("key", vo.getKey());
		return session.selectList(namespace + ".search_list", map);

	}

	@Override

	public List<HashMap<String, Object>> reply_list(QueryVO vo, int category, int filter) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("category", category);
		map.put("query", vo.getQuery());
		map.put("size", vo.getSize());
		map.put("page", vo.getPage());
		map.put("start", vo.getStart());
		map.put("key", vo.getKey());
		map.put("filter", filter);

		return session.selectList(namespace + ".reply_list ", map);

	}

	@Override
	public void viewcnt(int post_id) {
		session.update(namespace + ".viewcnt", post_id);
	}

	@Override
	public List<HashMap<String, Object>> filter_list(QueryVO vo, int category, int filter) {

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("category", category);
		map.put("query", vo.getQuery());
		map.put("size", vo.getSize());
		map.put("page", vo.getPage());
		map.put("start", vo.getStart());
		map.put("key", vo.getKey());
		map.put("filter", filter);

		// TODO Auto-generated method stub
		return session.selectList(namespace + ".filter_list", map);
	}

	@Override
	public int total(QueryVO vo, int category, int filter) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("query", vo.getQuery());
		map.put("category", category);
		map.put("filter", filter);
		return session.selectOne(namespace + ".total", map);
	}

	@Override
	public String address1(String uid) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".address1", uid);
	}

	@Override
	public HashMap<String, Object> read(int post_id) {
		return session.selectOne(namespace + ".read", post_id);
	}

	@Override
	public HashMap<String, Object> read(int post_id, String uid) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("post_id", post_id);
		map.put("uid", uid);
		return session.selectOne(namespace + ".info", map);
	}

	@Override
	public void update(CommVO vo) {
		session.selectOne(namespace + ".update", vo);

	}

	@Override
	public void delete(CommVO vo) {
		session.selectOne(namespace + ".delete", vo);

	}

	@Override
	public int reply_total(int post_origin) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".reply_total", post_origin);
	}

	@Override
	public int total1(QueryVO vo) {
		return session.selectOne(namespace + ".total1", vo);
	}

	@Override
	public void insertFavorites(int post_id, String uid) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("post_id", post_id);
		map.put("uid", uid);
		session.insert(namespace + ".insert_favorites", map);
	}

	@Override
	public void deleteFavorites(int post_id, String uid) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("post_id", post_id);
		map.put("uid", uid);
		session.delete(namespace + ".delete_favorites", map);
	}

	@Override
	public void updateFavorites(int post_id, int amount) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("post_id", post_id);
		map.put("amount", amount);
		session.update(namespace + ".update_favorites", map);
	}

	@Override
	public int mylikes(int post_id, String uid) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("post_id", post_id);
		map.put("uid", uid);
		return session.selectOne(namespace+".mylikes",map);
	}
 
	@Override
	public void vote_insert(VoteVO vo) {
		 session.insert(namespace+".vote_insert",vo);
		
		
	}

	@Override
	public List<HashMap<String, Object>> show_vote(int post_id) {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".show_vote",post_id);
	}

	@Override
	public void update_votecnt(VoteVO vo) {
 
		session.update(namespace+".update_votecnt",vo);
	}

	@Override
	public void update_vote_result(VoteVO vo) {
		session.insert(namespace+".update_vote_result",vo);
		
	}

	@Override
	public HashMap<String,Object> myvote(String uid,int post_id) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("uid", uid);
		map.put("post_id", post_id);
		return session.selectOne(namespace+".myvote",map);
	}

	@Override
	public void update_votes(VoteVO vo) {
		session.update(namespace+".update_votes",vo);
		
	}
	
	
	
	
	
	 
	
	/*
	
	@Override
	public void vote_insert(String title, String res, String res2, String res3) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("title", title);
		map.put("res", res);
		map.put("res2", res2);
		map.put("res3", res3);
		 session.insert(namespace+".vote_insert"+map);
		*/
		
	}

 