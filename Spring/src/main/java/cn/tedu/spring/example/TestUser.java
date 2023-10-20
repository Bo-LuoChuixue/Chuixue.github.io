package cn.tedu.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试IoC控制反转【Spring框架创建对象】
 */

public class TestUser {
    public static void main(String[] args) {
        //Spring框架创建对象
        ApplicationContext context=new AnnotationConfigApplicationContext("cn.tedu.spring.example");
        User user3 = context.getBean(User.class);
        user3.run();
    }
}
