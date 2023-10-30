package cn.tedu._04weibo.mapper;

import cn.tedu._04weibo.pojo.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {
    /**
     * 发表评论接口
     * @param comment 实体类
     * @return 整数
     */
    int insertComment(Comment comment);
}
