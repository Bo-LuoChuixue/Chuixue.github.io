package cn.tedu._04weibo.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 自定义枚举类状态码
 */

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum StatusCode {
    NOT_LOGIN(1000,"未登录"),
    LOGIN_SUCCESS(1001,"登陆成功"),
    PASSWORD_ERROR(1002,"密码错误"),
    USERNAME_ERROR(1003,"用户名错误"),
    USERNAME_ALREADY_EXISTS(1004,"用户名已存在"),
    OPERATION_SUCCESS(2001,"操作成功"),
    OPERATION_FAILED(2002,"操作失败"),
    THROWABLE_ERROR(8888,"Throwable异常"),
    VALIDATED_ERROR(3002,"参数校验失败");
    private Integer code;
    private String msg;
}
