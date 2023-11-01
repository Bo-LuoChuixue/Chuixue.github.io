package cn.tedu._04weibo.exception;

import cn.tedu._04weibo.common.response.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {
    public JsonResult doHandleRuntimeException(){
        return JsonResult.ok();
    }
}
