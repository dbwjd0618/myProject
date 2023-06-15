package com.yj.myproject.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	
	public static String getNewFileName(String originFileName) {
		
		String ext = "";
		int dotIndex = originFileName.lastIndexOf(".");
		if(dotIndex > -1)
			ext = originFileName.substring(dotIndex);
		
		//new 파일명 : yyyyMMdd_HHmmssSSS_rnd.txt
		String newFileName = new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(new Date())
						   + "_" + (int)(Math.random()*1000) + ext;
		
		return newFileName;
		
	}

}
