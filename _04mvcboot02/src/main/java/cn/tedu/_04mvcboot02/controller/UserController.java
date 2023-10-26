package cn.tedu._04mvcboot02.controller;

import cn.tedu._04mvcboot02.mapper.UserMapper;
import cn.tedu._04mvcboot02.pojo.dto.UserAddDTO;
import cn.tedu._04mvcboot02.pojo.entity.User;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class UserController {
    //自动装配
    @Autowired
    private UserMapper userMapper;

    /**
     * 添加用户
     */
    @RequestMapping("/v1/users/insert")
    @ResponseBody
    public String addUser(UserAddDTO userAddDTO){
        /*
            1.获取请求体数据;
            2.将数据插入数据表[MyBatis-接口方法];
         */
        //插入数据,一定使用实体类
        User user = new User();
        //复制属性
        BeanUtils.copyProperties(userAddDTO, user);
        user.setCreated(new Date());
        //调用接口方法
        userMapper.insertUser(user);
        return "添加成功";
    }
}









