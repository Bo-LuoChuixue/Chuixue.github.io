package cn.tedu._04weibo.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 注册功能DTO类
 */

@Data
public class UserRegDTO {
    //用户名,密码,昵称
    @ApiModelProperty(value = "用户名",required = true,example = "Tony")
    private String username;
    private String password;
    private String nickname;
}
