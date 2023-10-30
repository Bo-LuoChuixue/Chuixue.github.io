package cn.tedu._04weibo.controller;

import cn.tedu._04weibo.mapper.WeiboMapper;
import cn.tedu._04weibo.pojo.dto.InsertWeiboDTO;
import cn.tedu._04weibo.pojo.entity.Weibo;
import cn.tedu._04weibo.pojo.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
@RequestMapping("/v1/weibo/")
public class WeiboController {
    //自动装配
    @Autowired
    private WeiboMapper weiboMapper;

    @PostMapping("insert")
    public int insertWeibo(@RequestBody InsertWeiboDTO insertWeiboDTO, HttpSession session){
        /*
            1.校验用户登录状态
            2.发布微博[调用接口]
         */
        UserVO userVO = (UserVO) session.getAttribute("user");//1.校验用户登录状态
        if (userVO == null){ //未登录
            return 2;
        }
        //2.存入数据
        Weibo weibo = new Weibo();
        BeanUtils.copyProperties(insertWeiboDTO, weibo);
        weibo.setCreated(new Date());
        weibo.setUserId(userVO.getId());
        weiboMapper.insertWeibo(weibo);
        //发布成功
        return 1;
    }
}








