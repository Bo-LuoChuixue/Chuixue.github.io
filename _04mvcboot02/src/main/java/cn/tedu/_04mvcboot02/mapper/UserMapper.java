package cn.tedu._04mvcboot02.mapper;

import cn.tedu._04mvcboot02.pojo.entity.User;
import cn.tedu._04mvcboot02.vo.UserListVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 添加用户
     * @param user 实体类
     * @return 受影响的数据条数
     */
    int insertUser(User user);

    List<UserListVO> selectUserList();
}








