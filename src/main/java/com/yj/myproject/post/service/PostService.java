package com.yj.myproject.post.service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.yj.myproject.attach.model.Attachment;
import com.yj.myproject.post.model.Post;

public interface PostService {

	List<Post> postList();

	List<Post> postForm(String boardCode);

	int insertPost(Post post, List<Attachment> attachList);

	ModelAndView goExcel(String boardCode);

	List<Post> listPost(String boardCode);

	List<Post> listDetailPost(String boardCode, int postNo);
	
}
