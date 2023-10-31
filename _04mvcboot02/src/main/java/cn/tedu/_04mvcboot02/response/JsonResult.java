package cn.tedu._04mvcboot02.response;

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

    public JsonResult(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.msg=statusCode.getMsg();
    }

    public JsonResult(StatusCode statusCode,Object data) {
        this.code=statusCode.getCode();
        this.msg=statusCode.getMsg();
        this.data=data;
    }

    public static JsonResult ok(Object data){
        return new JsonResult(StatusCode.OPERATION_SUCCESS, data);
    }

    public static JsonResult ok(){
        return ok(null);
    }
}
