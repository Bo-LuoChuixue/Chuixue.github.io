package cn.tedu._04mvcboot02.controller;

import cn.tedu._04mvcboot02.pojo.dto.UserAddDTO;
import cn.tedu._04mvcboot02.pojo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/v1/users/insert")
    @ResponseBody
    public String addUser(UserAddDTO userAddDTO){
        /*
            1.获取请求体数据；
            2.将数据插入数据表[MyBatis-接口方法]
         */
        //插入数据，一定使用实体类
        User user=new User();
        return "添加成功";
    }
}
