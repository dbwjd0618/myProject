package com.yj.myproject.account.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yj.myproject.account.model.Account;

@Repository
public class AccountDAOImpl implements AccountDAO {
	
	@Autowired
	SqlSessionTemplate sqlSession;

	@Override
	public Account login(String memberID) {
		return sqlSession.selectOne(memberID);
	}

}
