package cn.tedu.spring.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBlog {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.life");
        Blog blog = context.getBean(Blog.class);
        System.out.println("4:使用阶段:" + blog);
        // 关闭IoC容器[关闭容器时会销毁Bean对象]
        context.close();
    }
}
