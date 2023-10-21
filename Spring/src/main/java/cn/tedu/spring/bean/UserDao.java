package cn.tedu.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    /*
        Value注解：bean对象属性复制，只能注入简单类型数据，如字符串，基本类型
     */
    @Value("jdbc:mysql://localhost:3306/tedu")
    private String url;
    @Value("root")
    private String username;
    @Value("root")
    private String password;

    @Override
    public String toString() {
        return "UserDao{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
