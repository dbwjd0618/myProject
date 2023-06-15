package com.yj.myproject.post;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yj.myproject.attach.model.Attachment;
import com.yj.myproject.common.exception.PostException;
import com.yj.myproject.common.util.Util;
import com.yj.myproject.post.model.Post;
import com.yj.myproject.post.service.PostService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/post")
@Slf4j
public class PostController {
	
	@Autowired
	PostService postService;
	
	// 갤러리 리스트 불러오기
	@GetMapping("/postForm.do")
	public String postForm(Model model, @RequestParam("boardCode") String boardCode) {
		List<Post> postContents = postService.postForm(boardCode);
		model.addAttribute("postContents", postContents);
		
		return "post/postForm";
	}
	
	// 엑셀 출력하기
	@GetMapping("/goExcel.do")
	public ModelAndView goExcel(@RequestParam("boardCode") String boardCode, HttpServletResponse response) throws IOException {
		ModelAndView mav = postService.goExcel(boardCode);
		
		return mav;
	}
	
	// 게시판 상세화면 띄우기
	@GetMapping("/postDetailForm.do")
	public String postView(@RequestParam("boardCode") String boardCode, @RequestParam("postNo") int postNo) {
		ModelAndView mav = new ModelAndView();
		List<Post> detailList = postService.listDetailPost(boardCode, postNo);
		
		return "post/postDetailForm";
	}
	
	// 글쓰기
	@PostMapping("/postWrite.do")
	public String postWrite(Post post,
							RedirectAttributes redirectAttributes,
							HttpServletRequest request,
							@RequestParam(value="upFile", required=false) MultipartFile[] upFile,
							@RequestParam("postWriter") String postWriter) {
		
		List<Attachment> attachList = new ArrayList<Attachment>();
		
		for(MultipartFile f : upFile) {
				if(f.isEmpty()) continue;
				
				// 파일명 재생성 newFileName으로 저장
				String originFileName = f.getOriginalFilename();
				String newFileName = Util.getNewFileName(originFileName);
				
				String saveDirectory = request.getServletContext().getRealPath("/resources/upload/post");
				
				log.debug("사진등록="+newFileName);
				
				try {
					f.transferTo(new File(saveDirectory, newFileName));
				} catch (IllegalStateException | IOException e) {
					e.printStackTrace();
				}
				
				Attachment attach = new Attachment();
				attach.setOriginFileName(originFileName);
				attach.setNewFileName(newFileName);
				
				attachList.add(attach);
			}
			int result = 0;
		
			 if(postWriter==null || !postWriter.equals("yujeong")) {
				 redirectAttributes.addFlashAttribute("msg", "관리자만 등록할 수 있습니다."); 
			 }
			 else {
				 
				 result = postService.insertPost(post, attachList);
				 
				 redirectAttributes.addFlashAttribute("msg", result>0?"정상등록되었습니다.":"등록실패");
			 }
			 
			 if(1 != result) throw new PostException("첨부파일 등록 실패");
		
		return "redirect:/post/postForm.do?boardCode="+post.getBoardCode();
	}
	
	// 갤러리 리스트 불러오기
	@GetMapping("/listPost.do")
	public String postList(Model model, @RequestParam("boardCode") String boardCode) {
		List<Post> listPost = postService.listPost(boardCode);
		model.addAttribute("listPost", listPost);
		
		return "post/postList";
	}
}
