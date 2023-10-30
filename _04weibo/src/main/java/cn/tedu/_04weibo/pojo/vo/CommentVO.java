package cn.tedu._04weibo.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

/**
 * 评论列表的VO类
 */

@Data
public class CommentVO {
    //评论id,评论内容,评论时间,用户昵称
    private Long id;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date created;
    private String nickname;
}
