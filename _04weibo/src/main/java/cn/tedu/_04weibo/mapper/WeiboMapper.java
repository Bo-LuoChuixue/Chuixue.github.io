package cn.tedu._04weibo.mapper;

import cn.tedu._04weibo.pojo.entity.Weibo;
import cn.tedu._04weibo.pojo.vo.WeiboInsertVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WeiboMapper {
    /**
     * 发布微博功能
     * 插入数据:使用实体类
     */
    int insertWeibo(Weibo weibo);

    List<WeiboInsertVO> selectIndex();
}
