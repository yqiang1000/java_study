package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void test() {
//        getAllUser();
//        getUserById(1);
//        addUser();
//        delete();
        updateUser();

    }


    public void getAllUser () {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> allUser = mapper.getAllUser();
        for (User user : allUser) {
            System.out.print(user);
        }
        session.close();
    }

    public void getUserById (int id) {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUserById(id);
        System.out.print(user);
        session.close();
    }

    @Test
    public void addUser () {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user1 = new User(11, "张春", "2323");
        int resp = mapper.addUser(user1);
        System.out.print(resp);
        session.close();
    }

    public void delete () {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int resp = mapper.deleteUser(7);
        session.close();
    }

    @Test
    public void updateUser () {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user1 = new User(7, "郭靖", "44");
        int resp = mapper.updateUser(user1);
        session.close();
    }
}
