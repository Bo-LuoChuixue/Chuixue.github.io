package cn.tedu._04weibo;

import cn.tedu._04weibo.mapper.UserMapper;
import cn.tedu._04weibo.pojo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class UserTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void selectUserTest(){
        System.out.println(userMapper.selectUser("Lucy"));
    }

    @Test
    void insertUserTest(){
        User user = new User();
        user.setUsername("Jim");
        user.setPassword("123456");
        user.setNickname("jim");
        user.setCreated(new Date());
        System.out.println(userMapper.insertUser(user));
    }
}







