package cn.tedu._04mvcboot02.response;

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
    OPERATION_SUCCESS(2000,"操作成功"),
    OPERATION_FAILED(3000,"操作失败");
    private Integer code;
    private String msg;
}
