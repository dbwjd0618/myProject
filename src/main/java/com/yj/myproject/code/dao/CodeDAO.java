package com.yj.myproject.code.dao;

import java.util.List;

import com.yj.myproject.code.model.Code;

public interface CodeDAO {

	int insertCode(Code code);

	List<Code> codeList();

}
