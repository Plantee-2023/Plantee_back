package com.plantee.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.plantee.domain.CartVO;
import com.plantee.domain.PurchaseVO;
import com.plantee.domain.UserVO;

public class PurchaseDAOImpl implements PurchaseDAO {
	@Autowired
	SqlSession session;
	String namespace = "com.example.mapper.PurchaseMapper";

	@Override
	public List<HashMap<String, Object>> listOrders(int purchase_id) {
		return session.selectList(namespace + ".list_orders", purchase_id);
	}

	@Override
	public void insertOrder(CartVO vo) {
		session.insert(namespace + ".insert_order", vo);
	}

	@Override
	public List<HashMap<String, Object>> listPurchase(UserVO vo) {
		return session.selectList(namespace + ".list_purchase", vo);
	}

	@Override
	public int totalPurchase(int user_id) {
		return session.selectOne(namespace + ".total_purchase", user_id);
	}

	@Override
	public void insertPurchase(PurchaseVO vo) {
		session.insert(namespace + ".insert_purchase", vo);
	}

}
