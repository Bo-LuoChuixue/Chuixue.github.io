package cn.tedu._04mvcboot02.mapper;

import cn.tedu._04mvcboot02.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insertUser(User user);
}
