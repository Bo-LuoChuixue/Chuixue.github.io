package cn.tedu._04mvcboot02.controller;

import cn.tedu._04mvcboot02.mapper.UserMapper;
import cn.tedu._04mvcboot02.pojo.dto.UpdateDTO;
import cn.tedu._04mvcboot02.pojo.dto.UserAddDTO;
import cn.tedu._04mvcboot02.pojo.entity.User;
import cn.tedu._04mvcboot02.vo.UserListVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    //自动装配
    @Autowired(required = false)
    private UserMapper userMapper;

    /**
     * 添加用户
     */
    @RequestMapping("/v1/users/insert")
    @ResponseBody
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
    @RequestMapping("/v1/users/userList")
    @ResponseBody
    public List<UserListVO> userList(){
        return userMapper.selectUserList();
    }

    @RequestMapping("/v1/users/delete")
    @ResponseBody
    public String deleteUser(int id){
        userMapper.deleteUser(id);
        return "删除成功";
    }

    @RequestMapping("/v1/users/update")
    @ResponseBody
    public String updateUser(UpdateDTO updateDTO){
        userMapper.updateUser(updateDTO);
        return "修改成功";
    }
}









