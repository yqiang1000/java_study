package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    @Select("select * from teacher")
    List<Teacher> getTeacher();

    Teacher getTeacherById(int id);

    Teacher getTeacherById1(int id);
}
