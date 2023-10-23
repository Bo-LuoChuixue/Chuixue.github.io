package cn.tedu.spring.config;

import cn.tedu.spring.auto.UserCache;
import cn.tedu.spring.bean.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //1.获取UserDao对象
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);
        //2.获取UserCache对象
        UserCache userCache = context.getBean(UserCache.class);
        System.out.println(userCache);
    }
}
