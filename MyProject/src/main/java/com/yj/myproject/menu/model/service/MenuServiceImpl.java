package com.yj.myproject.menu.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yj.myproject.menu.model.dao.MenuDAO;
import com.yj.myproject.menu.model.vo.Gallary;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	MenuDAO menuDAO;

	@Override
	public List<Gallary> gallaryList() {
		return menuDAO.gallaryList();
	}

	@Override
	public List<Gallary> gallaryList(String boardCode) {
		return menuDAO.gallaryList(boardCode);
	}
}
