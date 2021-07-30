package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> selectUser();

    User getUserById(int id);

    int addUser(User user);

    int deleteByUserId(int id);

    List<User> getUserByIds(List<Integer> ids);

    int addUserByMap(Map<String, Object> map);

    int updateUser(User user);

    User selectUserNameLike(String name);

}
