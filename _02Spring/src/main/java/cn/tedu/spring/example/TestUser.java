package cn.tedu.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试:IoC控制反转[Spring框架创建对象]
 */
public class TestUser {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /**
         * 方式1: new方式
         */
        User user1 = new User();
        user1.run();

        /**
         * 方式2: 利用反射
         */
        Class zz = Class.forName("cn.tedu.spring.example.User");
        User user2 = (User) zz.newInstance();
        user2.run();

        /**
         * 方式3: Spring框架创建对象[通过注解方式]
         */
//        //1.Spring创建IoC容器,扫描指定包下的所有的类,将添加着@Component注解的类,都创建好Spring Bean对象,放入IoC容器中
//        // 复制包路径: Ctrl + Shift + Alt + c
//        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.example");
//        //2.通过 getBean(类名.class) 方法,从IoC容器中,获取指定的Spring Bean对象
//        User user3 = context.getBean(User.class);
//        //3.使用Spring框架创建出来的Spring Bean对象
//        user3.run();

        /**
         * 方式4:通过Spring框架创建Bean对象[通过xml配置文件方式]
         */
        ApplicationContext context1 = new ClassPathXmlApplicationContext("bean.xml");
        User user4 = context1.getBean(User.class);
        user4.run();
    }
}









