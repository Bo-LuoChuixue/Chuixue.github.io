package cn.tedu._04weibo.controller;

import cn.tedu._04weibo.common.response.JsonResult;
import cn.tedu._04weibo.common.response.StatusCode;
import cn.tedu._04weibo.mapper.WeiboMapper;
import cn.tedu._04weibo.pojo.dto.InsertWeiboDTO;
import cn.tedu._04weibo.pojo.entity.Weibo;
import cn.tedu._04weibo.pojo.vo.UserVO;
import cn.tedu._04weibo.pojo.vo.WeiboDetailVO;
import cn.tedu._04weibo.pojo.vo.WeiboIndexVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
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
    public JsonResult insertWeibo(@RequestBody InsertWeiboDTO insertWeiboDTO, @ApiIgnore HttpSession session) {
        /*
            1.校验用户登录状态
            2.发布微博[调用接口]
         */
        //1.校验用户登录状态
        UserVO userVO = (UserVO) session.getAttribute("user");
        if (userVO == null) {//未登录
            return new JsonResult(StatusCode.NOT_LOGIN);
        }
        //2.存入数据
        Weibo weibo = new Weibo();
        BeanUtils.copyProperties(insertWeiboDTO, weibo);
        weibo.setCreated(new Date());
        weibo.setUserId(userVO.getId());
        weiboMapper.insertWeibo(weibo);
        //发布成功
        return new JsonResult(StatusCode.OPERATION_SUCCESS);
    }

    /**
     * 微博首页列表展示[不需要校验用户登录状态]
     */
    @ApiOperation(value = "微博首页")
    @GetMapping("selectIndex")
    public JsonResult selectIndex(){
        /*
            直接调用接口获取所有微博信息
         */
        List<WeiboIndexVO> weiboIndexVOS = weiboMapper.selectIndex();
        return new JsonResult(StatusCode.OPERATION_SUCCESS, weiboIndexVOS);
    }

    /**
     * 微博详情功能
     */
    @ApiOperation(value = "微博详情")
    @GetMapping("selectById")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "id", value = "微博编号", required = true, dataType = "int"),
            @ApiImplicitParam(name = "username", value = "用户名", required = true, dataType = "string")
    })
    public JsonResult selectById(int id, String username){//username参数单纯用于做Knife4j测试，无其他作用
        WeiboDetailVO weiboDetailVO = weiboMapper.selectById(id);
        return new JsonResult(StatusCode.OPERATION_SUCCESS, weiboDetailVO);
    }
}
