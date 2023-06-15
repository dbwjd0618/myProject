package com.yj.myproject.code.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Code implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int seqCode;
	private String codeGroup;
	private String codeValue;
	private String codeName;
	private String codeEtc;
	private String ynUse;
	private String codeOrder;
	private String ymdFrt;
}
