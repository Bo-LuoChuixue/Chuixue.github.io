package cn.tedu.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Repository注解:数据访问层,将该类标识为Spring的组件,为该类创建Spring Bean对象;
 * Serivce注解:业务层,将该类标识为Spring的组件,为该类创建Spring Bean对象;
 * Controller注解:控制层,将该类标识为Spring的组件,为该类创建Spring Bean对象;
 * Component注解:不分层,将该类标识为普通的Spring的组件,为该类创建Spring Bean对象.
 */

//@Repository
//@Service
//@Controller
@Component
public class UserDao {
    /*
        @Value注解:
        1.Bean对象属性赋值,只能注入简单类型数据,比如字符串,基本类型.
        2.添加位置: 属性上, set方法上.
     */
    @Value("jdbc:mysql://localhost:3306/tedu")
    private String url;
    //@Value("root")
    private String username;
    @Value("root")
    private String password;

    @Value("root")
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}










