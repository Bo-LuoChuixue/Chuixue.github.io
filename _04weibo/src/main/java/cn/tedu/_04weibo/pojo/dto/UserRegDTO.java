package cn.tedu._04weibo.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;

/**
 * 注册功能DTO类
 */

@Data
public class UserRegDTO {
    //用户名,密码,昵称
    @NonNull
    @ApiModelProperty(value = "用户名",required = true,example = "橙留香")
    private String username;
    @ApiModelProperty(value = "密码",required = true,example = "123456")
    private String password;
    @ApiModelProperty(value = "昵称",required = true,example = "小橙")
    private String nickname;
}
