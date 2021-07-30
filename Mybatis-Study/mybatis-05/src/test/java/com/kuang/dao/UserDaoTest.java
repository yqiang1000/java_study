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
        getUserById(1);
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
}
