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

    /**
     * 第二个构造方法：用于没有具体数据的controller方法
     */
    public JsonResult(StatusCode statusCode){
        this.code=statusCode.getCode();
        this.msg=statusCode.getMsg();
    }

    /**
     * 第三个构造方法：针对有具体数据返回的controller方法
     * @param statusCode
     * @param data
     */
    public JsonResult(StatusCode statusCode,Object data){
        this.code=statusCode.getCode();
        this.msg=statusCode.getMsg();
        this.data=data;
    }
}
