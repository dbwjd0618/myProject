package com.yj.myproject.attach.model;

import java.io.Serializable;
import java.sql.Date;

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
public class Attachment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int fileNo;
	private String boardCode;
	private int postNo;
	private String originFileName;
	private String newFileName;
	private Date uploadDate;
	private int downloadCount;
	private String status;

}
