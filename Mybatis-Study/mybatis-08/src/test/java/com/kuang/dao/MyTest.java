package com.kuang.dao;

import com.kuang.pojo.Blog;
import com.kuang.utils.IDUtils;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

//    Create table Blog (
//            id VARCHAR(255) not null comment '博客id',
//    title VARCHAR(255) not null comment '博客标题',
//    author VARCHAR(255) not null comment '博客作者',
//    create_date datetime not null comment '创建时间',
//    views int(10) not null default 0 comment '浏览量'
//            ) ENGINE=INNODB DEFAULT CHARSET=utf8

    @Test
    public void Test () {
        Map map = new HashMap();
        map.put("title", "一");
        queryBlog(map);
    }

    @Test
    public void getAllBlog() {
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        List<Blog> blogs = mapper.getAllBlog();
        for (Blog blog : blogs) {
            System.out.print(blog);
        }
        session.close();
    }

    public void addBlogNewBlog() {
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("初二英语书");
        blog.setAuthor("李四");
        blog.setCreateDate(new Date());
        blog.setViews(32);
        addBlog(blog);

//        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("初二英语书");
        blog.setAuthor("李四");
        blog.setCreateDate(new Date());
        blog.setViews(32);
        addBlog(blog);

//        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("初二英语书");
        blog.setAuthor("李四");
        blog.setCreateDate(new Date());
        blog.setViews(32);
        addBlog(blog);

//        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("高一地理书");
        blog.setAuthor("王五");
        blog.setCreateDate(new Date());
        blog.setViews(234);
        addBlog(blog);

//        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("高中英语书");
        blog.setAuthor("小刘");
        blog.setCreateDate(new Date());
        blog.setViews(3);
        addBlog(blog);
    }

    public void addBlog(Blog blog) {
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        mapper.addBlog(blog);
        session.close();
    }

    public void queryBlog(Map map) {
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        List<Blog> blogs = mapper.queryBlogListIF(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        session.close();
    }

    @Test
    public void getBlogById() {
        SqlSession session = MybatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog = mapper.getBlogById(1);
        System.out.println(blog);
        System.out.println("==========================");
        session.close();

        SqlSession session1 = MybatisUtils.getSqlSession();
        BlogMapper mapper1 = session1.getMapper(BlogMapper.class);
        Blog blog1 = mapper1.getBlogById(1);
        System.out.println(blog1);
        System.out.println(blog == blog1);
        session1.close();
    }
}
