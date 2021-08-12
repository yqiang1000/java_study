package com.kuang.mapper;

import com.kuang.pojo.User;

import java.util.List;

public interface UserMapper {

    User selectUser(int id);


    List<User> selectAllUser();
}
