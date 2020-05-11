package com.yj.myproject.account.model.dao;

import com.yj.myproject.account.model.vo.Account;

public interface AccountDAO {

	Account login(String memberID);

}
