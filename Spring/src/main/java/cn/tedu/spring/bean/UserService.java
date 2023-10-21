package cn.tedu.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 在UserService中注入UserDao对象
 */

@Service
public class UserService {
    @Value("快吃饭了")
    private String name;
    //@Autowired(required = false)
    private UserDao userDao;

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                ", userDao=" + userDao +
                '}';
    }
}
