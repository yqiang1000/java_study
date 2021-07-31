package com.kuang.dao;

import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    // 按查询嵌套查询
    List<Student> getStudent();

    // 按结果嵌套查询
    List<Student> getStudent2();


}
