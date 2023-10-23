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

    /*
      @Autowired注解:注入对象类型的数据,只能根据类型进行装配;
       1.required参数:
          默认为true,表示装配失败会抛出异常, 设置为false,则装配失败不会报错.
          一般使用默认的true即可.
       2.添加位置: 属性上[常用], set方法上, 构造方法上
     */
    //@Autowired(required = false)
    private UserDao userDao;

    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    //@Autowired
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
