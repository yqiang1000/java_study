package com.kuang.dao;

import com.kuang.pojo.Teacher;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public void test () {

        getTeacherById(1);
        getTeacherById1(1);
        getTeacherById(2);
        getTeacherById1(2);
    }


    @Test
    public void getTeacher() {
        SqlSession sqlSession = MybatisUtils.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.getTeacher();
        for (Teacher teacher : teachers) {
            System.out.print(teacher);
        }
        sqlSession.close();
    }


//    Teacher{id=1,
//            name='秦老师',
//            students=[
//        Student{id=1, name='小明', tid=1},
//        Student{id=2, name='小红', tid=1},
//        Student{id=3, name='小张', tid=1},
//        Student{id=5, name='小王', tid=1},
//        Student{id=6, name='小叶', tid=1},
//        Student{id=8, name='小五', tid=1}]}
    public void getTeacherById(int id) {
        SqlSession sqlSession = MybatisUtils.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherById(id);
        System.out.print(teacher);
        sqlSession.close();
    }

    public void getTeacherById1(int id) {
        SqlSession sqlSession = MybatisUtils.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherById1(id);
        System.out.print(teacher);
        sqlSession.close();
    }
}
