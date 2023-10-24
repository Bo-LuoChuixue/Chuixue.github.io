package cn.tedu._03mybatis.mapper;

import cn.tedu._03mybatis.pojo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * 1.Mapper注解：MyBatis注解，由框架为该接口创建实现类
 * 2.Insert注解：MyBatis注解，由框架将SQL语句转为底层的JDBC代码来操作数据库
 */

@Mapper
public interface UserMapper {
    //@Insert("insert into user(username,password,nickname,created) values (#{username},#{password},#{nickname},#{created})")
    void insertUser(User user);
}
