package cn.tedu._03mybatis.mapper;

import cn.tedu._03mybatis.pojo.entity.Weibo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface WeiboMapper {
    @Insert("INSERT INTO weibo(content,created,user_id) VALUES (#{content},#{created},#{userId})")
    int insertWeibo(Weibo weibo);

    /*
        根据微博id删除1条微博
     */
    @Delete("delete from weibo where id=#{id}")
    int deleteById(int id);

    /*
        根据微博id修改微博数据
     */
    @Update("update weibo set content=#{content},created=#{created},user_id=#{userId} where id=#{id}")
    int updateById(Weibo weibo);

    /*
        根据微博id查询1条微博
        字段名和属性名不一样，查询时可以使用别名
     */
    @Select("select id,content,created,user_id userId from weibo where id=#{id}")
    Weibo selectById(int id);
}
