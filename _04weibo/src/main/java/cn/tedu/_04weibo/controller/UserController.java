package cn.tedu._04weibo.controller;

import cn.tedu._04weibo.mapper.UserMapper;
import cn.tedu._04weibo.pojo.dto.UserLoginDTO;
import cn.tedu._04weibo.pojo.dto.UserRegDTO;
import cn.tedu._04weibo.pojo.entity.User;
import cn.tedu._04weibo.pojo.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Slf4j注解：Lombok提供的日志注解
 */

@Api(tags = "01.用户模块")
@Slf4j
@RestController
@RequestMapping("/v1/users/")
public class UserController {
    //自动装配
    @Autowired
    private UserMapper userMapper;

    /**
     * RequestBody注解:将客户端[前端]传递的数据转为JSON格式的字符串;
     * ResponseBody注解:将服务端[JAVA]传递的数据转为JSON格式的字符串;
     */
    @ApiOperation(value = "注册功能")
    @PostMapping("reg")
    public int reg(@RequestBody UserRegDTO userRegDTO){
        /*
            1.确认用户名是否被占用[查询数据接口]
              1.1 被占用: return 2;
              1.2 未被占用: 插入数据表[插入数据接口]
         */
        log.debug("userRegDTO="+userRegDTO);//使用日志进行调试
        UserVO userVO = userMapper.selectUser(userRegDTO.getUsername());
        if(userVO != null){ //被占用
            return 2;
        }
        //执行注册流程
        User user = new User();
        BeanUtils.copyProperties(userRegDTO, user);
        user.setCreated(new Date());
        //调用接口方法
        userMapper.insertUser(user);
        return 1;
    }

    @ApiOperation(value = "登录功能")
    @PostMapping("login")
    public int login(@RequestBody UserLoginDTO userLoginDTO, HttpSession session){
        /*
            1.调用接口,根据用户名查询;
              1.1 未查到数据,return 3;
              1.2 查到了数据,校验密码
                  * 密码一致: 登录成功,return 1;
                  * 密码不一致: 密码错误,return 2;
         */
        UserVO userVO = userMapper.selectUser(userLoginDTO.getUsername());
        if(userVO == null){ //用户名错误
            return 3;
        }
        //校验密码
        if(userVO.getPassword().equals(userLoginDTO.getPassword())){
            //登录成功之前,需要在服务器内存中设置会话保持标识key-value
            session.setAttribute("user", userVO);
            return 1; //登录成功
        }
        return 2; //密码错误
    }

    /**
     * 获取当前用户功能
     */
    @GetMapping("currentUser")
    public UserVO currentUser(HttpSession session){
        //userVO可能为非空,可能为null
        UserVO userVO = (UserVO) session.getAttribute("user");

        return userVO;
    }

    /**
     * 退出登录功能
     */
    @GetMapping("logout")
    public void logout(HttpSession session){
        session.removeAttribute("user");
    }

}










