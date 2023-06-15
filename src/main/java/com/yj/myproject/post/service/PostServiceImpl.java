package com.yj.myproject.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.yj.myproject.attach.dao.AttachDAO;
import com.yj.myproject.attach.model.Attachment;
import com.yj.myproject.common.exception.PostException;
import com.yj.myproject.post.dao.PostDAO;
import com.yj.myproject.post.model.Post;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PostServiceImpl implements PostService {
	
	@Autowired
	PostDAO postDAO;
	
	@Autowired
	AttachDAO attachDAO;

	@Override
	public List<Post> postList() {
		return postDAO.postList();
	}

	@Override
	public List<Post> postForm(String boardCode) {
		return postDAO.postForm(boardCode);
	}

	@Override
	public int insertPost(Post post, List<Attachment> attachList) {
		int result = 0;
		//1. Post 테이블에 insert
		result = postDAO.insertPost(post);
		
		if(result == 0) {
			throw new PostException("게시글 등록 오류");
		}
		
		//2. Attachment 테이블에 insert, 반드시 postNo 필요
		for(Attachment attach : attachList) {
			attach.setPostNo(post.getPostNo());
			attach.setBoardCode(post.getBoardCode());
			result = attachDAO.insertAttach(attach);
			
			if(result == 0) {
				throw new PostException("첨부파일 등록 오류");
			}
		}
		
		return result;
	}

	@Override
	public ModelAndView goExcel(String boardCode) {
//		// 1. 엑셀 헤드 생성
//		Workbook workBook = new HSSFWorkbook();
//		Sheet sheet = workBook.createSheet(boardCode);
//		int rowNo = 0;
//		
//		Row headerRow = sheet.createRow(rowNo++);
//		headerRow.createCell(0).setCellValue("유형");
//		headerRow.createCell(1).setCellValue("번호");
//		headerRow.createCell(2).setCellValue("제목");
//		headerRow.createCell(3).setCellValue("내용");
//		headerRow.createCell(4).setCellValue("작성자");
//		headerRow.createCell(5).setCellValue("작성일");
//		
//		// 2. 실제 데이터가 들어갈 리스트 조회
//		List<Post> list = listPost(boardCode);
//		
//		for(Post g: list) {
//			Row row = sheet.createRow(rowNo++);
//			row.createCell(0).setCellValue(g.getBoardCode());
//			row.createCell(1).setCellValue(g.getPostNo());
//			row.createCell(2).setCellValue(g.getPostTitle());
//			row.createCell(3).setCellValue(g.getPostContent());
//			row.createCell(4).setCellValue(g.getPostWriter());
//			row.createCell(5).setCellValue(g.getPostWriteTime());
//		}
//		// 3-1. 엑셀 다운로드 ( 다운로드 경로로 바로 다운됨 )
//		/**
//		 *	response.setHeader("Content-Type", "application/vnd.ms-xls");
//		 *  response.setHeader("Content-Disposition", "attachement;  fileName=puppy_excel.xls");
//		 *  workBook.write(response.getOutputStream()); // 파일형식 및 확장명이 일치하지 않을 때 아래 코드를 넣고 해결되었음
//		 */
//		
//		
//		// 3-2. 엑셀 다운로드 ( 지정한 경로에 다운로드 됨 )
//		// 오늘날짜 구해서 변환하기
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//		Calendar calendar = Calendar.getInstance();
//		Date dateObj = calendar.getTime();
//		String today = sdf.format(dateObj);
//
//		// 파일경로 생성
//		StringBuffer dir = new StringBuffer();
//		dir.append("E:");
//		dir.append(File.separator);
//		dir.append("엑셀테스트");
//		dir.append(File.separator);
//		dir.append(today);
//		dir.append(File.separator);
//		
//		FileUtil.createDir(dir.toString());
//		
//		// 파일명 생성
//		int cnt = 0;
//		StringBuffer fileName = createFileName(dir.toString(), cnt, boardCode);
//		
//		String directory = "E:\\엑셀테스트\\"+today;
//		File existDir = new File(directory);
//		
//		// 기존 파일명이 있는 경우 파일에 숫자달기
//		File[] existFileNames = existDir.listFiles();
//		for(File existFileName : existFileNames) {
//			if(fileName.toString().equals(existFileName.toString())) {
//				cnt += 1;
//				fileName.setLength(0);
//				fileName = createFileName(dir.toString(), cnt, boardCode);
//			}
//		}
//		
//		// ajax 구현
		ModelAndView mav = new ModelAndView("jsonView");
//		
//		try {
//			FileOutputStream fs = new FileOutputStream(fileName.toString());
//			workBook.write(fs);
//			fs.close();
//			mav.addObject("result","success");
//		} catch(Exception e) {
//			e.printStackTrace();
//			mav.addObject("result","fail");
//		}
		return mav;
	}

	@Override
	public List<Post> listPost(String boardCode) {
		return postDAO.listPost(boardCode);
	}
	
	public StringBuffer createFileName(String dir, int cnt, String boardCode) {
		StringBuffer fileName = new StringBuffer();
		fileName.append(dir.toString());
		fileName.append(boardCode);
		fileName.append("_"+cnt);
		fileName.append(".xls");
		
		return fileName;
	}

	@Override
	public List<Post> listDetailPost(String boardCode, int postNo) {
		Post post = new Post();
		post.setBoardCode(boardCode);
		post.setPostNo(postNo);
		return postDAO.listDetailPost(post);
	}
}
