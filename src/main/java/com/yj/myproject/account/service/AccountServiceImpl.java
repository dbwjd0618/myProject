package com.yj.myproject.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yj.myproject.account.dao.AccountDAO;
import com.yj.myproject.account.model.Account;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountDAO accountDAO;

	@Override
	public Account login(String memberID) {
		return accountDAO.login(memberID);
	}
}
