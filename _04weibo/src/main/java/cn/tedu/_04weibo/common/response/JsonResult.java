package cn.tedu._04weibo.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 统一响应结果的类:common.response.JsonResult
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult {
    //响应状态码code,提示消息msg,响应数据data
    private Integer code;
    private String msg;
    private Object data;
}
