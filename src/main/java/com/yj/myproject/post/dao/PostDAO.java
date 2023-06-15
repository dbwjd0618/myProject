package com.yj.myproject.post.dao;

import java.util.List;

import com.yj.myproject.post.model.Post;

public interface PostDAO {

	List<Post> postList();

	List<Post> postForm(String boardCode);

	int insertPost(Post post);

	List<Post> listPost(String boardCode);

	List<Post> listDetailPost(Post post);
}
