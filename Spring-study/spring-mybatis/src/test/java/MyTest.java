import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import javafx.application.Application;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {

    private static SqlSessionFactory sessionFactory;
    @Test
    public void  test() throws IOException {
//        String resources = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resources);
//        sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sessionFactory.openSession();
//
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = mapper.selectAllUser();
//        for (User user : users) {
//            System.out.println(user);
//        }


        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = context.getBean(UserMapper.class);
        for (User user : userMapper.selectAllUser()) {
            System.out.println(user);
        }

    }
}
