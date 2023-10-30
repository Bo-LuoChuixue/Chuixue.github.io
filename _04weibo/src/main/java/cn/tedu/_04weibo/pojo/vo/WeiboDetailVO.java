package cn.tedu._04weibo.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

/**
 * 微博详情页功能的VO类
 */

@Data
public class WeiboDetailVO {
    //微博id,微博内容,微博发布时间,用户昵称
    private Long id;
    private String content;
    /*
      1.pattern参数:指定日期时间的格式
        年:y 月:M 日:d 时:H 分:m 秒:s
        小大小, 大小小
        格式1: 2000-01-01 00:00:00
        格式2: 2000/01/01 00:00:00
        格式3: 2000年01月01日00时00分00秒
      2.timezone参数:指定时区
     */
    @JsonFormat(pattern = "yyyy年MM月dd日HH时mm分ss秒", timezone = "GMT+8")
    private Date created;
    private String nickname;
}








