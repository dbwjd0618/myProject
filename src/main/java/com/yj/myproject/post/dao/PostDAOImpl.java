package com.yj.myproject.post.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yj.myproject.post.model.Post;

@Repository
public class PostDAOImpl implements PostDAO {

	@Autowired
	SqlSessionTemplate sqlSession;

	@Override
	public List<Post> postList() {
		return sqlSession.selectList("post.selectList");
	}

	@Override
	public List<Post> postForm(String boardCode) {
		return sqlSession.selectList("post.selectPost", boardCode);
	}

	@Override
	public int insertPost(Post Post) {
		return sqlSession.insert("post.insertPost", Post);
	}

	@Override
	public List<Post> listPost(String boardCode) {
		return sqlSession.selectList("post.listPost", boardCode);
	}

	@Override
	public List<Post> listDetailPost(Post Post) {
		return sqlSession.selectList("post.listDetailPost", Post);
	}
}
