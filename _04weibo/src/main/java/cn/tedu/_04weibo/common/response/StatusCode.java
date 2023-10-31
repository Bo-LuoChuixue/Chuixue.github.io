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

    private Integer code;
    private String msg;
}
