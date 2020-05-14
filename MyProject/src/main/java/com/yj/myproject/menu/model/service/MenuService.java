package com.yj.myproject.menu.model.service;

import java.util.List;

import com.yj.myproject.menu.model.vo.Gallary;

public interface MenuService {

	List<Gallary> gallaryList();

	List<Gallary> gallaryList(String boardCode);
	
}
