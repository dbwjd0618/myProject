package com.yj.myproject.code.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yj.myproject.code.dao.CodeDAO;
import com.yj.myproject.code.model.Code;

@Service
public class CodeServiceImpl implements CodeService {

	@Autowired
	CodeDAO codeDAO;

	@Override
	public int insertCode(Code code) throws Exception {
		int result = codeDAO.insertCode(code);
		
		if(result == 0) throw new Exception();
		
		return result;
	}

	@Override
	public List<Code> codeList() {
		return codeDAO.codeList();
	}
}
