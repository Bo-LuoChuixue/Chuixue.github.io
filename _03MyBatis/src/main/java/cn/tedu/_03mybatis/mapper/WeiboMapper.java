package cn.tedu._03mybatis.mapper;

import cn.tedu._03mybatis.pojo.entity.Weibo;
import cn.tedu._03mybatis.pojo.vo.WeiboVO1;
import cn.tedu._03mybatis.pojo.vo.WeiboVO2;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface WeiboMapper {
    //@Insert("INSERT INTO weibo(content,created,user_id) VALUES (#{content},#{created},#{userId})")
    int insertWeibo(Weibo weibo);

    /*
        根据微博id删除1条微博
     */
    //@Delete("delete from weibo where id=#{id}")
    int deleteById(int id);

    /*
        根据微博id修改微博数据
     */
    //@Update("update weibo set content=#{content},created=#{created},user_id=#{userId} where id=#{id}")
    int updateById(Weibo weibo);

    /*
        根据微博id查询1条微博
        字段名和属性名不一样，查询时可以使用别名
     */
    //@Select("select id,content,created,user_id userId from weibo where id=#{id}")
    Weibo selectById(int id);

    /*
        查询所有微博信息
     */
    //@Select("select id,content,created,user_id userId from weibo")
    List<Weibo> selectAll();

    /*
        指定字段查询：
        查询指定微博id的 内容content和发布时间created
     */
    //@Select("select content,created from weibo where id=#{wid}")
    WeiboVO1 selectByWid(int wid);

    /**
     * 练习：指定字段查询
     * 查询指定用户【用户id】发的所有微博信息【微博id，微博内容，微博发布时间】
     */
    //@Select("select id,content,created from weibo where user_id=#{uid}")
    List<WeiboVO2> selectByUid(int uid);
}
