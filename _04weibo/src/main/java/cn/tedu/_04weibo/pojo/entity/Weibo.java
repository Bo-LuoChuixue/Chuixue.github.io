package cn.tedu._04weibo.pojo.entity;

import lombok.Data;
import java.util.Date;

/**
 * 微博表实体类
 */

@Data
public class Weibo {
    private Long id;
    private String content;
    private Date created;
    private Long userId;
}
