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

    /**
     * 第一个构造方法：用于没有具体返回数据的controller方法
     * @param code
     * @param msg
     */
    public JsonResult(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
