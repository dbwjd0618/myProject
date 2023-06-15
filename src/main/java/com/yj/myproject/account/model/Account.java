package com.yj.myproject.account.model;

import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String memberID;
	private String memberPWD;
	private String memberName;
	private String phone;
	private String address;
	private Date birthday;
	private String gender;
	private String grade;
	private String email;
	private Date enrolldate;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
