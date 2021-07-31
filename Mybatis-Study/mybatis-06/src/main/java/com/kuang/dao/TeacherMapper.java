package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {

    @Select("select * from Teacher where id = #{tid}")
    Teacher getTeacherByTid(@Param("tid") int id);
}
