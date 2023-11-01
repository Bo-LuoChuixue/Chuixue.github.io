package cn.tedu._04weibo.exception;

import cn.tedu._04weibo.common.response.JsonResult;
import cn.tedu._04weibo.common.response.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * ControllerAdvice註解:
 *   1.添加在類上,標識此類為全局異常處理器的類;
 *   2.處理所有由控制器controller中拋出的異常;
 *   3.處理流程:
 *     3.1 當控制器拋出異常時,框架會首先檢查有沒有定義全局異常處理器;
 *     3.2 如果定義了,則會到該異常處理器的類中找對應的異常處理方法;
 *     3.3 如果定義了異常處理方法,則由該方法處理異常並返迴響應給客戶端;
 * <p>
 * RestControllerAdvice註解：
 *     組合註解，等價於ControllerAdvice註解+ResponseBody註解
 */

@Slf4j
//@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * ExceptionHandler註解：
     *     此方法為異常處理方法
     */
    @ExceptionHandler
    public JsonResult doHandleRuntimeException(RuntimeException exception){
        String data=exception.getMessage();//從異常對象exception中獲取具體的異常提示信息
        log.error("RuntimeException"+data);
        return new JsonResult(StatusCode.OPERATION_FAILED,data);
    }
}
