package cn.tedu.spring.life;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBlog {
    public static void main(String[] args) {
        final String YELLOW = "\u001B[93m";
        final String RESET_CODE = "\033[0m";
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("cn.tedu.spring.life");
        Blog blog = context.getBean(Blog.class);
        System.out.println(YELLOW+"4：使用阶段——"+blog+RESET_CODE);
        //关闭IoC容器【关闭容器时会销毁Bean对象】
        context.close();
    }
}
