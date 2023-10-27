package cn.tedu._04weibo.mapper;

import cn.tedu._04weibo.pojo.entity.User;
import cn.tedu._04weibo.pojo.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * 注册功能:查询数据接口
     * SELECT id,password,nickname FROM blog.user WHERE username=用户名
     * 此条查询语句应用场景:
     *   1.注册功能: id
     *   2.获取当前用户功能: nickname
     *   3.登录功能: password
     */
    UserVO selectUser(String username);

    /**
     * 注册功能:插入数据接口
     */
    int insertUser(User user);
}








