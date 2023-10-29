package cn.tedu._03mybatis.mapper;

import cn.tedu._03mybatis.pojo.entity.Weibo;
import cn.tedu._03mybatis.pojo.vo.WeiboVO1;
import cn.tedu._03mybatis.pojo.vo.WeiboVO2;
import cn.tedu._03mybatis.pojo.vo.WeiboVO3;
import cn.tedu._03mybatis.pojo.vo.WeiboVO4;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface WeiboMapper {
    /**
     * 在微博表中插入1条数据
     * @param weibo 实体类
     * @return 受影响的数据条数
     */
    //@Insert("INSERT INTO weibo(content,created,user_id) VALUES (#{content},#{created},#{userId})")
    int insertWeibo(Weibo weibo);

    /**
     * 根据微博id删除1条微博
     */
    //@Delete("DELETE FROM weibo WHERE id=#{id}")
    int deleteById(int id);

    /**
     * 根据微博id修改微博数据
     */
    //@Update("UPDATE weibo SET content=#{content},created=#{created},user_id=#{userId} WHERE id=#{id}")
    int updateById(Weibo weibo);

    /**
     * 单条数据全字段查询:
     * 根据微博id查询1条微博的信息,要求显示所有字段[id,content,created,user_id]
     * 如果字段名和属性名不一样,查询时可以使用别名
     */
    //@Select("SELECT id,content,created,user_id userId FROM weibo WHERE id=#{id}")
    Weibo selectById(int id);

    /**
     * 多条数据全字段查询:
     * 查询所有微博的信息[id,content,created,user_id]
     */
    //@Select("SELECT id,content,created,user_id userId FROM weibo")
    List<Weibo> selectAll();

    /**
     * 指定字段查询:
     * 查询指定微博[id]的 内容content和发布时间created
     * SELECT content,created FROM weibo WHERE id=#{wid}
     */
    //@Select("SELECT content,created FROM weibo WHERE id=#{wid}")
    WeiboVO1 selectByWid(int wid);

    /**
     * 练习:指定字段查询
     * 查询指定用户[用户id]发的所有微博信息:[微博id,微博内容,微博发布时间]
     * 接口方法名: selectByUid(int uid);
     */
    //@Select("SELECT id,content,created FROM weibo WHERE user_id=#{uid}")
    List<WeiboVO2> selectByUid(int uid);

    /**
     * 动态修改
     * 根据微博id动态修改微博的信息[id,content,created,user_id]
     */
    int dynamicUpdate(Weibo weibo);

    /**
     * 动态删除1: 数组方式
     * 根据微博id动态删除微博的信息
     * DELETE FROM weibo WHERE id IN (2,3,6)
     */
    int dynamicDelete1(Integer[] ids);

    /**
     * 动态删除2: List集合方式
     * 根据微博id动态删除微博的信息
     * DELETE FROM weibo WHERE id IN (2,3,6)
     */
    int dynamicDelete2(List<Integer> ids);

    /**
     * 统计微博表中共有多少条数据
     * SELECT COUNT(*) FROM weibo
     */
    int selectCount();

    /**
     * 多表查询:
     * 微博详情页面: 根据微博的id, 查询该条微博的  内容, 发布时间, 用户昵称
     */
    WeiboVO3 selectWeiboById(int wid);

    /**
     * 多表查询
     * 根据微博的ID, 获取该条微博的所有评论:  评论id, 评论内容, 评论时间, 用户昵称
     */
    List<WeiboVO4> selectComment(int wid);
}
