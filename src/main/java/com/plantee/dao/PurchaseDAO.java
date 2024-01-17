package com.plantee.dao;

import java.util.*;

import com.plantee.domain.CartVO;
import com.plantee.domain.PurchaseVO;
import com.plantee.domain.UserVO;

public interface PurchaseDAO {
	public List<HashMap<String, Object>> listOrders(int purchase_id);
	public void insertOrder(CartVO vo);
	public List<HashMap<String, Object>> listPurchase(UserVO vo);
	public int totalPurchase(int user_id);
	public void insertPurchase(PurchaseVO vo);
}
