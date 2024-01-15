package com.plantee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.plantee.dao.CartDAO;
import com.plantee.domain.CartVO;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	CartDAO dao;

	@Transactional
	@Override
	public void insert(CartVO vo) {
		int check = dao.check(vo);
		if (check == 0) {
			dao.insert(vo);
		} else {
//			vo.setQnt(1);
			dao.update(vo);
		}
	}

}
