package cn.tedu._04weibo.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 注册功能DTO类
 */

@Data
public class UserRegDTO {
    //用户名,密码,昵称
    //@NotNull(message = "用户名不能为null")
    //@NotEmpty(message = "用户名不能为null和空字符串")
    //@NotBlank(message = "用户名不能为null和空字符串,也不能为空白串")
    @Size(min=5,max=10,message = "用户名必须在5~10位之间")
    @ApiModelProperty(value = "用户名",required = true,example = "橙留香")
    private String username;
    @ApiModelProperty(value = "密码",required = true,example = "123456")
    private String password;
    @ApiModelProperty(value = "昵称",required = true,example = "小橙")
    private String nickname;
}
