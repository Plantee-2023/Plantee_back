package com.plantee.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAOImpl implements TestDAO {

	@Autowired
	SqlSession session;
	String namespace = "com.plantee.mapper.MysqlMapper";

	@Override
	public String now() {
		return session.selectOne(namespace + ".now");
	}

}