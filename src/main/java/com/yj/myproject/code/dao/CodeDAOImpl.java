package com.yj.myproject.code.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yj.myproject.code.model.Code;

@Repository
public class CodeDAOImpl implements CodeDAO {
	
	@Autowired
	SqlSessionTemplate sqlSession;

	@Override
	public int insertCode(Code code) {
		return sqlSession.insert("setting.insertCode", code);
	}

	@Override
	public List<Code> codeList() {
		return sqlSession.selectList("setting.codeList");
	}

}
