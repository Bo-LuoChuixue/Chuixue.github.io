package cn.tedu.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试IoC控制反转【Spring框架创建对象】
 */

public class TestUser {
    public static void main(String[] args) {
        //Spring框架创建对象【通过注解方式】
        ApplicationContext context=new AnnotationConfigApplicationContext("cn.tedu.spring.example");
        User user1 = context.getBean(User.class);
        user1.run();

        //Spring框架创建对象【通过xml配置文件方式】
        ApplicationContext context1=new ClassPathXmlApplicationContext("bean.xml");
        //User user2= (User) context1.getBean("user");
        User user2 = context1.getBean(User.class);
        user2.run();
    }
}
