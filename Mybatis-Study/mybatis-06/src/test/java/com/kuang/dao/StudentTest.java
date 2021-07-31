package com.kuang.dao;

import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;
import com.kuang.utils.MybatisUtils;
import com.sun.tools.classfile.ConstantPool;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentTest {

    @Test
    public void test() {
        getStudent2();
    }


    public void getStudent() {
        SqlSession sqlSession = MybatisUtils.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> allStudent = mapper.getStudent();
        for (Student student : allStudent) {
            System.out.print(student);
        }
        sqlSession.close();
    }

    public void getTeacher () {
        SqlSession sqlSession = MybatisUtils.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherByTid(1);
        System.out.print(teacher);
        sqlSession.close();

    }

    @Test
    public void getStudent2 () {
        SqlSession sqlSession = MybatisUtils.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent2();
        for (Student student : studentList) {
            System.out.print(student);
        }
        sqlSession.close();

    }


}
