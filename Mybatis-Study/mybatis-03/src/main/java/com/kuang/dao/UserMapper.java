package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAllUser();

    User getOneUser(Integer id);

}
