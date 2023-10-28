package cn.tedu._04mvcboot02.mapper;

import cn.tedu._04mvcboot02.pojo.dto.UpdateDTO;
import cn.tedu._04mvcboot02.pojo.entity.User;
import cn.tedu._04mvcboot02.pojo.vo.UserListVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface UserMapper {
    /**
     * 添加用户
     * @param user 实体类
     * @return 受影响的数据条数
     */
    int insertUser(User user);

    /**
     * 查询用户列表
     */
    List<UserListVO> selectUserList();

    /**
     * 删除用户信息
     */
    int deleteUser(int id);

    /**
     * 修改用户信息
     */
    int updateUser(UpdateDTO updateDTO);

    User selectById(int uid);

}








