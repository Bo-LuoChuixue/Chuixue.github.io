package cn.tedu._04weibo.mapper;

import cn.tedu._04weibo.pojo.entity.Weibo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WeiboMapper {
    /**
     * 发布微博功能
     * 插入数据:使用实体类
     */
    int insertWeibo(Weibo weibo);

}







