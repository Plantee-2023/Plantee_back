package com.plantee.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plantee.domain.CommentsVO;
import com.plantee.domain.QueryVO;
import com.plantee.domain.StoreVO;
import com.plantee.domain.UserVO;

@Repository
public class StoreDAOImpl implements StoreDAO {

	@Autowired
	SqlSession session;
	String namespace = "com.plantee.mapper.StoreMapper";

	@Override
	public HashMap<String, Object> getUserInfo(QueryVO vo) {
		return session.selectOne(namespace + ".getUserInfo", vo);
	}
	
	@Override
	public List<HashMap<String, Object>> list(QueryVO vo) {
		vo.setStart((vo.getPage() - 1) * vo.getSize());
		return session.selectList(namespace + ".list", vo);
	}

	@Override
	public int total(QueryVO vo) {
		return session.selectOne(namespace + ".total", vo);
	}

	@Override
	public HashMap<String, Object> read(int store_id) {
		return session.selectOne(namespace + ".read", store_id);
	}

	@Override
	public void delete(int store_id) {
		session.delete(namespace + ".delete", store_id);
	}

	@Override
	public void insert(StoreVO vo) {
		session.insert(namespace + ".insert", vo);
	}

	@Override
	public void update(StoreVO vo) {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void image(StoreVO vo) {
		session.update(namespace + ".image", vo);
	}

	@Override
	public void like(int user_id, int store_id) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("user_id", user_id);
		map.put("store_id", store_id);
		session.insert(namespace + ".like", map);
	}

	@Override
	public void update_like(int store_id, int amount) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("store_id", store_id);
		map.put("amount", amount);
		session.update(namespace + ".update_like", map);
	}

	@Override
	public void delete_like(int user_id, int store_id) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("user_id", user_id);
		map.put("store_id", store_id);
		session.delete(namespace + ".delete_like", map);
	}
	

	@Override
	public int count(UserVO vo) {
		return session.selectOne(namespace + ".count", vo);
	}

	
	// Comments
	@Override
	public List<Map<String, Object>> review_list(int store_id) {
		List<Map<String, Object>> resultMaps = session.selectList(namespace + ".reviewlist", store_id);
		return resultMaps;
	}

	@Override
	public int review_cnt(int store_id) {
		return session.selectOne(namespace + ".reviewcnt", store_id);
	}
	
	// Comments
	@Override
	public Map<String, Object> review_one(CommentsVO vo) {
		Map<String, Object> resultMap = session.selectOne(namespace + ".reviewOne", vo);
		return resultMap;
	}

	@Override
	public int stars_avg(int store_id) {
		return session.selectOne(namespace + ".starsavg", store_id);
	}

	@Override
	public void review_insert(CommentsVO vo) {
		session.insert(namespace + ".reviewinsert", vo);
	}
	
	@Override
	public void review_update(CommentsVO vo) {
		session.update(namespace + ".reviewupdate", vo);
	}

	@Override
	public List<Map<String, Object>> question_list(CommentsVO vo) {
		List<Map<String, Object>> questionMaps = session.selectList(namespace + ".list_qna", vo);
		return questionMaps;
	}

	@Override
	public int question_cnt(int store_id) {
		return session.selectOne(namespace + ".questioncnt", store_id);
	}

	@Override
	public void delete_comment(int comment_id) {
		session.delete(namespace + ".comment_delete", comment_id);
	}

}