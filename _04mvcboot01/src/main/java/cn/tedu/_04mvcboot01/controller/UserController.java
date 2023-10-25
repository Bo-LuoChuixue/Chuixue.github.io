package cn.tedu._04mvcboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/v1/users/login")
    public String login(){
        return "登陆成功";
    }
}
