package com.yj.myproject.code.service;

import java.util.List;

import com.yj.myproject.code.model.Code;

public interface CodeService {

	// 입력한 코드 정보를 테이블에 삽입
	int insertCode(Code code) throws Exception;

	List<Code> codeList();

}
