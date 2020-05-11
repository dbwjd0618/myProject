package com.yj.myproject.menu.model.vo;

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

public class Gallary implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String boardCode;
	private String boardName;
	private int postNo;
	private String postTitle;
	private String postContent;
	private String postWriter;
	private Date postWriteTime;
	private int readCount;

}
