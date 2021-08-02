package com.yq.dao;

import com.yq.pojo.User;
import com.yq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class UserTest {

    @Test
    public void addUser() throws Exception {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setId(2);
        user.setUserCode("10240001");
        user.setUserName("小明");
        user.setUserPassword("xiaoming");
        user.setGender(1);
        user.setBirthday(new Date());
        user.setPhone("15300000001");
        user.setAddress("浙江省杭州市西湖区");
        user.setUserRole(10340001);
        user.setCreatedBy(12040000);
        user.setCreationDate(new Date());
        user.setModifyBy(12040000);
        user.setModifyDate(new Date());
        mapper.add(user);
        session.close();
    }

    @Test
    public void getLoginUser() throws Exception {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User loginUser = mapper.getLoginUser("10240002");
        System.out.println(loginUser);
        session.close();
    }


    @Test
    public void getUserList() throws Exception {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList(
                null,
                null,
                null,
                1);
        for (User user : userList) {
            System.out.println(user);
        }
        session.close();
    }

}
