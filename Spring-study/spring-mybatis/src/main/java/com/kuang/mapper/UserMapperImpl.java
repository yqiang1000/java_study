package com.kuang.mapper;

import com.kuang.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {


    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public User selectUser(int id) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser(1);
    }

    public List<User> selectAllUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectAllUser();
    }

}
