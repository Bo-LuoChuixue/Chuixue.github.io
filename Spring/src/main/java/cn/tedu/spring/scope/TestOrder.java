package cn.tedu.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试类
 */
public class TestOrder {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.scope");
        // 第1次获取对象:order1
        Order order1 = context.getBean(Order.class);
        System.out.println(order1);
        // 第2次获取对象:order2
        Order order2 = context.getBean(Order.class);
        System.out.println(order2);
    }
}







