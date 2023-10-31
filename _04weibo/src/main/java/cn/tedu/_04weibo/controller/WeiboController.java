package cn.tedu._04weibo.controller;

import cn.tedu._04weibo.mapper.WeiboMapper;
import cn.tedu._04weibo.pojo.dto.InsertWeiboDTO;
import cn.tedu._04weibo.pojo.entity.Weibo;
import cn.tedu._04weibo.pojo.vo.UserVO;
import cn.tedu._04weibo.pojo.vo.WeiboDetailVO;
import cn.tedu._04weibo.pojo.vo.WeiboIndexVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Api(tags = "02.微博模块")
@RestController
@RequestMapping("/v1/weibo/")
public class WeiboController {
    //自动装配
    @Autowired
    private WeiboMapper weiboMapper;

    /**
     * 发布微博功能
     */
    @ApiOperation(value = "发布微博")
    @PostMapping("insert")
    public int insertWeibo(@RequestBody InsertWeiboDTO insertWeiboDTO, HttpSession session){
        /*
            1.校验用户登录状态
            2.发布微博[调用接口]
         */
        //1.校验用户登录状态
        UserVO userVO = (UserVO) session.getAttribute("user");
        if (userVO == null){//未登录
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

    /**
     * 微博首页列表展示[不需要校验用户登录状态]
     */
    @ApiOperation(value = "微博首页")
    @GetMapping("selectIndex")
    public List<WeiboIndexVO> selectIndex(){
        /*
            直接调用接口获取所有微博信息
         */
        return weiboMapper.selectIndex();
    }

    /**
     * 微博详情功能
     */
    @ApiOperation(value = "微博详情")
    @GetMapping("selectById")
    public WeiboDetailVO selectById(int id){
        return weiboMapper.selectById(id);
    }
}
