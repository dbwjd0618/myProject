package com.yj.myproject.menu.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yj.myproject.menu.model.vo.Gallary;

@Repository
public class MenuDAOImpl implements MenuDAO {

	@Autowired
	SqlSessionTemplate sqlSession;

	@Override
	public List<Gallary> gallaryList() {
		return sqlSession.selectList("myproject.selectList");
	}
}
