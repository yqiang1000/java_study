
import com.kuang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        // 获取spring上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Hello hello = context.getBean("hello", Hello.class);
        System.out.println(hello.getStr());
    }
}
