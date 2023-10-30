package cn.tedu._04weibo.pojo.vo;

import lombok.Data;

@Data
public class UserVO {
    /*
     *   1.注册功能: id
     *   2.获取当前用户功能: nickname
     *   3.登录功能: password
     */
    private Long id;
    private String password;
    private String nickname;
}
