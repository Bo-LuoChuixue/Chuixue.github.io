package cn.tedu._04weibo.pojo.entity;

import lombok.Data;
import java.util.Date;

/**
 * 用户表实体类
 */

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private Date created;
}
