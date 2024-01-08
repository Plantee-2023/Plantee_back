package com.plantee.dao;

import java.util.*;

import com.plantee.domain.CartVO;
import com.plantee.domain.UserVO;

public interface CartDAO {
	public List<Map<String, Object>> list(UserVO vo);
	public int total(String uid);
	public String sum(String uid);
	public void update(CartVO vo);
	public void updateQnt(CartVO vo);
	public int check(CartVO vo);
	public void insert(CartVO vo);
	public void delete(int cid);
}
