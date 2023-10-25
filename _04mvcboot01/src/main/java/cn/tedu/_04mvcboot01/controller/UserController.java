package cn.tedu._04mvcboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/v1/users/login")
    @ResponseBody
    public String login(){
        return "登陆成功";
    }
}
