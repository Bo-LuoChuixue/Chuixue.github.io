package cn.tedu._04mvcboot02.controller;

import cn.tedu._04mvcboot02.mapper.UserMapper;
import cn.tedu._04mvcboot02.pojo.dto.UpdateDTO;
import cn.tedu._04mvcboot02.pojo.dto.UserAddDTO;
import cn.tedu._04mvcboot02.pojo.entity.User;
import cn.tedu._04mvcboot02.pojo.vo.UserListVO;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * RestController注解:
 *   1.组合注解,等价于Controller注解+ResponseBody注解;
 *   2.添加此注解后,所有控制器方法均不需要再添加@ResponseBody注解;
 */
//@Controller
@RequestMapping("/v1/users/")
@RestController
public class UserController {
    //自动装配
    @Autowired(required = false)
    private UserMapper userMapper;

    /**
     * 添加用户
     */
    @PostMapping("insert")
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

    /**
     * 查询用户列表
     */
    @GetMapping("userList")
    //@ResponseBody
    public List<UserListVO> userList(){
        /*
            1.调用接口方法查询所有的用户名和密码
         */
        System.out.println(userMapper.selectUserList());
        return userMapper.selectUserList();
    }

    /**
     * 删除用户
     */
    @GetMapping("delete")
    //@ResponseBody
    public String deleteUser(int id){
        /*
            1.调用接口方法删除数据
         */
        userMapper.deleteUser(id);
        return "删除成功";
    }

    /**
     * 更新用户信息
     */
    @PostMapping("update")
    //@ResponseBody
    public String updateUser(UpdateDTO updateDTO){
        userMapper.updateUser(updateDTO);

        return "修改成功";
    }

    /**
     * 根据用户id,查询该用户所有信息
     */
    @GetMapping("selectById/{uid}")
    public User selectById(@PathVariable int uid){
        return userMapper.selectById(uid);
    }
}









