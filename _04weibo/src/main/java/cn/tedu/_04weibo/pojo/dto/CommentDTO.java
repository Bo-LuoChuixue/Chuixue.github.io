package cn.tedu._04weibo.pojo.dto;

import lombok.Data;

/**
 * 发表评论DTO类
 */

@Data
public class CommentDTO {
    //微博id,评论内容
    private Long weiboId;
    private String content;
}








