package com.yj.myproject.attach.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yj.myproject.attach.model.Attachment;

@Repository
public class AttachDAOImpl implements AttachDAO {

	@Autowired
	SqlSessionTemplate sqlSession;

	@Override
	public int insertAttach(Attachment attach) {
		return sqlSession.insert("attach.insertAttachment", attach);
	}
}
