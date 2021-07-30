package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTest {

    @Test
    public void selectUser() {
        getUserNameLike();
    }


    public void selectAllUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user: users){
            System.out.println(user);
        }
        session.close();
    }


    public void getUserById() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user + '\'');
        session.close();
    }

    public void insertUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setId(8);
        user.setName("哈哈哈");
        user.setPwd("dgfsdf");
        int resp = mapper.addUser(user);
        session.commit();
        session.close();
    }

    public void deleteUserById() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.deleteByUserId(2);
        session.commit();
        session.close();
    }

    public void selectUserByIds () {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(3);
        List<User> users = mapper.getUserByIds(ids);
        for (User user: users){
            System.out.println(user);
        }
        session.close();
    }

    public void insertUserByMap() {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", 10);
        map.put("userName", "杨过");
        map.put("userPwd", "hangzhou");
        mapper.addUserByMap(map);
        sqlSession.commit();
        sqlSession.close();
    }

    public void updateUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setId(1);
        user.setName("小龙女");
        user.setPwd("xiaolongnv");
        mapper.updateUser(user);
        session.commit();
        session.close();
    }

    public void getUserNameLike() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectUserNameLike("杨");
        System.out.print(user);
        session.close();
    }
}
