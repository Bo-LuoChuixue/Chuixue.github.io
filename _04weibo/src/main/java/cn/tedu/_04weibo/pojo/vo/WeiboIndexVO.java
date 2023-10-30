package cn.tedu._04weibo.pojo.vo;

import lombok.Data;

/**
 * 微博首页列表展示功能的VO类
 */

@Data
public class WeiboIndexVO {
    //微博id,微博内容,用户昵称
    private Long id;
    private String content;
    private String nickname;
}







