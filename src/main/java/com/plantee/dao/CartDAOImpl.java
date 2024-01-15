package com.plantee.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plantee.domain.CartVO;
import com.plantee.domain.UserVO;

@Repository
public class CartDAOImpl implements CartDAO {
	@Autowired
	SqlSession session;
	String namespace = "com.plantee.mapper.CartMapper";

	@Override
	public void insert(CartVO vo) {
		session.insert(namespace + ".insert", vo);
	}
	
	@Override
	public int check(CartVO vo) {
		return session.selectOne(namespace + ".check", vo);
	}
	
	@Override
	public List<Map<String, Object>> list(UserVO vo) {
		return session.selectList(namespace + ".list", vo);
	}

	@Override
	public int total(String uid) {
		return session.selectOne(namespace + ".total", uid);
	}

	@Override
	public String sum(String uid) {
		return session.selectOne(namespace + ".sum", uid);
	}

	@Override
	public void update(CartVO vo) {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void updateQnt(CartVO vo) {
		session.update(namespace + ".update_qnt", vo);
	}

	@Override
	public void delete(int cart_id) {
		session.delete(namespace + ".delete", cart_id);
	}

}
