package cn.tedu._04weibo.mapper;

import cn.tedu._04weibo.pojo.entity.Comment;
import cn.tedu._04weibo.pojo.vo.CommentVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    /**
     * 发表评论接口
     * @param comment 实体类
     * @return 整数
     */
    int insertComment(Comment comment);

    /**
     * 评论列表接口
     * @param id
     * @return List集合
     */
    List<CommentVO> selectByWeiboId(int id);
}
