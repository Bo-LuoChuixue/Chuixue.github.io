package cn.tedu._04mvcboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    /**
     * RequestMapping注解：请求注解
     * ResponseBody注解：响应注解，允许控制器方法以返回值的形式返回给客户端数据
     */
    @RequestMapping("/v1/users/login")
    @ResponseBody
    public String login(){
        return "登陆成功";
    }
}
