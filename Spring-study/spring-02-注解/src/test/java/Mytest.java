import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        // 获取spring上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User hello = context.getBean("user", User.class);
        System.out.println(hello.getName());
    }

}
