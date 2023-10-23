package cn.tedu.spring.file;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDataBase {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("cn.tedu.spring.file");
        dataBase dataBase = context.getBean(dataBase.class);
        System.out.println(dataBase);
    }
}
