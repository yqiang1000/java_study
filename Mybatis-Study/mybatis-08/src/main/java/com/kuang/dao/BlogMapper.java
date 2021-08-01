package com.kuang.dao;

import com.kuang.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    List<Blog> getAllBlog();

    int addBlog(Blog blog);

    List<Blog> queryBlogListIF(Map map);

    Blog getBlogById(Integer id);
}
