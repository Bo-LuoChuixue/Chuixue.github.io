package cn.tedu._04weibo.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.*;

/**
 * 注册功能DTO类
 */

@Data
public class UserRegDTO {
    //用戶名,密碼,昵稱
    //@NotNull(message = "用戶名不能為null")
    //@NotEmpty(message = "用戶名不能為null和空字符串")
    //@NotBlank(message = "用戶名不能為null和空字符串,也不能為空白串")
    //@Size(min=5,max=10,message = "用戶名必須在5~10位之間")
    @Pattern(regexp = "^[\\u4e00-\\u9fa5]{0,7}$|^[a-zA-Z09]{0,14}$",message = "用户名不能超过7个汉字或14个字符")
    @ApiModelProperty(value = "用戶名",required = true,example = "橙留香")
    private String username;
    @ApiModelProperty(value = "密碼",required = true,example = "123456")
    private String password;
    @ApiModelProperty(value = "昵稱",required = true,example = "小橙")
    private String nickname;
}
