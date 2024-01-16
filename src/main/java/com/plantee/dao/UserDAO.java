package com.plantee.dao;

import java.util.HashMap;

import com.plantee.domain.UserVO;

public interface UserDAO {
	public HashMap<String,Object> read(String uid);
	public UserVO login(String uid);
	public void insert(UserVO vo);
	public void update(UserVO vo);
	public void password(UserVO vo);
	public void image(UserVO vo);
	public void delete(int user_id);

}