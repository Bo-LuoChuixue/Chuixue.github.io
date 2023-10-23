package cn.tedu._03mybatis.mapper;

import cn.tedu._03mybatis.pojo.entity.Weibo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

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
}
