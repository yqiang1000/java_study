package dao;

import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest {


    @Test
    public void test() {

        selectUserById();
        selectAllUser();

    }

    public void  selectUserById() {

        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getOneUser(1);
        System.out.print(user);

        session.close();
    }

    public void  selectAllUser() {

        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.selectAllUser();
        for (User user : userList) {
            System.out.print(user);
        }
        session.close();
    }


}
