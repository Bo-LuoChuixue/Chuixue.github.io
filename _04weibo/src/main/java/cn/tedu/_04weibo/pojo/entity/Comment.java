package cn.tedu._04weibo.pojo.entity;

import lombok.Data;
import java.util.Date;

/**
 * 评论表实体类
 */

@Data
public class Comment {
    private Long id;
    private String content;
    private Date created;
    private Long userId;
    private Long weiboId;
}
