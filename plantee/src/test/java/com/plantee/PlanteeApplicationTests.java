package com.plantee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.plantee.dao.TestDAO;
import com.plantee.dao.UserDAO;

@SpringBootTest
class PlanteeApplicationTests {
	
	@Autowired
	TestDAO dao;
	
	@Test
	void now() {
		System.out.println("......현재 시각: " + dao.now());
	}

	@Test
	void contextLoads() {
	}
	
	@Autowired
	UserDAO udao;
	
	@Test
	void read() {
		udao.read("red");
	}

}
