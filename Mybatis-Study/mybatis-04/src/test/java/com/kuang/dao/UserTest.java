package dao;

import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class UserTest {
    // 配置日志
    static Logger logger = Logger.getLogger(UserTest.class);

    @Test
    public void test() {

        selectUserById(1);
//        selectAllUser();

    }

    public void  selectUserById(Integer id) {

        logger.info("info:进入 selectUserById 方法， 参数 = " + id);

        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getOneUser(id);
        System.out.print(user);

        session.close();
        logger.info("info:结束 selectUserById 方法， 参数 = " + id);
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
