package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.plantee.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	SqlSession session;
	String namespace = "com.plantee.mapper.UserMapper";

	@Override
	public HashMap<String, Object> read(String uid) {
		return session.selectOne(namespace + ".read", uid);
	}

	@Override
	public UserVO login(String uid) {
		return session.selectOne(namespace + ".login", uid);
	}

	@Override
	public void update(UserVO vo) {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void image(UserVO vo) {
		session.update(namespace + ".image", vo);
	}

	@Override
	public void password(UserVO vo) {
		session.update(namespace + ".password", vo);
	}

	@Override
	public void insert(UserVO vo) {
		session.insert(namespace + ".insert", vo);
	}

	@Override
	public void delete(String uid) {
		session.delete(namespace + ".delete", uid);
	}

	@Override
	public List<HashMap<String, Object>> list(UserVO vo) {
		 return session.selectList(namespace + ".list", vo);
	}

}