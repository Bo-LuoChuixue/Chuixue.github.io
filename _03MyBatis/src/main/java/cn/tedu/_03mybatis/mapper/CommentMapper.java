package cn.tedu._03mybatis.mapper;

import cn.tedu._03mybatis.pojo.entity.Comment;
import cn.tedu._03mybatis.pojo.vo.*;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface CommentMapper {
    /**1. 插入: `insertComment` , 在评论表中插入1条数据;*/
    //@Insert("INSERT INTO comment(content,created,user_id,weibo_id) VALUES (#{content},#{created},#{userId},#{weiboId})")
    int insertComment(Comment comment);

    /**2. 删除: `deleteById` , 根据id删除1条评论;*/
    //@Delete("DELETE FROM comment WHERE id=#{id}")
    int deleteById(int id);

    /**3. 修改: `updateById` , 根据id修改评论信息;*/
    //@Update("UPDATE comment SET content=#{content},created=#{created},user_id=#{userId},weibo_id=#{weiboId} WHERE id=#{id}")
    int updateById(Comment comment);

    /**4. 查询:  `selectCommentById1`，根据评论的id查询评论的 **内容、用户ID、微博ID**（数据库表中确认）*/
    //@Select("SELECT content,user_id userId,weibo_id weiboId FROM comment WHERE id=#{cid}")
    CommentVO1 selectCommentById1(int cid);

    /**5. 查询 `selectCommentById2`，根据微博的id查询评论的 **内容、用户ID**（数据库表中确认）*/
    //@Select("SELECT content,user_id userId FROM comment WHERE weibo_id=#{wid}")
    List<CommentVO2> selectCommentById2(int wid);

    /**
     * 单表ResultMap
     * 根据微博的id查询该条微博的信息，
     * 只显示：微博编号id、内容content、用户编号user_id
     * SELECT id,content,user_id WHERE id=微博id
     */
    ResultMapVO1 selectResultMap1(int wid);

    /**
     * 单表ResultMap练习
     * 根据用户id查询该用户的相关信息: 用户id, 用户名, 密码, 昵称
     * 接口方法名:selectResultMap2, 参数名:uid
     * VO类名:ResultMapVO2
     * SQL语句:
     *        SELECT id,username,password,nickname FROM user
     *        WHERE id=用户的id
     */
    ResultMapVO2 selectResultMap2(int uid);

    /**
     * 多表ResultMap示例
     * 查询指定用户发布的所有的微博信息, 用户id,用户名, 微博所有字段信息
     */
    ResultMapVO3 selectResultMap3(int uid);

    /**
     * 多表ResultMap练习
     * 获取指定微博的所有评论: 微博id,微博内容,评论的集合
     * VO类名: ResultMapVO4
     * 接口方法名: selectResultMap4, 参数: wid
     * 步骤:
     *      1.创建VO类
     *      2.定义接口方法
     *      3.XML配置SQL
     *      4.测试方法测试
     */
    ResultMapVO4 selectResultMap4(int wid);
}
