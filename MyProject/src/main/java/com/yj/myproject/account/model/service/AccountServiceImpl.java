package com.yj.myproject.account.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yj.myproject.account.model.dao.AccountDAO;
import com.yj.myproject.account.model.vo.Account;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountDAO accountDAO;

	@Override
	public Account login(String memberID) {
		return accountDAO.login(memberID);
	}
}
