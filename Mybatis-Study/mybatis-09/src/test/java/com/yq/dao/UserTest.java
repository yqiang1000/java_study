package com.yq.dao;

import com.yq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserTest {

    @Test
    public void getUserList () {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.getUserList();
        session.close();
    }



}
