package cn.tedu._04weibo.controller;

import cn.tedu._04weibo.pojo.dto.InsertWeiboDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/v1/weibo/")
public class WeiboController {
    @PostMapping("insert")
    public int insertWeibo(@RequestBody InsertWeiboDTO insertWeiboDTO, HttpSession session){
        /*
            1.校验用户登录状态
            2.发布微博[调用接口]
         */
        return 1;
    }
}
