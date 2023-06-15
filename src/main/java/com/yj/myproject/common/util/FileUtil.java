package com.yj.myproject.common.util;

import java.io.File;

public class FileUtil {

	// 해당 경로가 존재하는지 확인
	public static boolean isExistDir(String dir) {
		if(dir == null || "".equals(dir))
			return false;
		
		File director = new File(dir);
		if(director.exists())
			return true;
		
		return false;
	}

	// 파일 경로의 존재여부를 따져 없으면 생성하도록 함
	public static boolean createDir(String dir) {
		if(dir == null || "".equals(dir))
			return false;
		
		boolean exsited = isExistDir(dir);
		if(!exsited) {
			File directory = new File(dir);
			directory.mkdir();
		}
		
		return true;
	}
}
