package cn.tedu._03mybatis;

import cn.tedu._03mybatis.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ResultMapTests {
    @Autowired
    private CommentMapper commentMapper;

    /**
     * 单表ResultMap
     * 根据微博的id查询该条微博的信息，
     * 只显示：微博编号id、内容content、用户编号user_id
     * SELECT id,content,user_id WHERE id=微博id
     */
    @Test
    void selectResultMap1Test(){
        System.out.println(commentMapper.selectResultMap1(200));
    }

    /**
     * 单表ResultMap练习
     * 根据用户id查询该用户的相关信息: 用户id, 用户名, 密码, 昵称
     * SQL语句:
     *        SELECT id,username,password,nickname FROM user
     *        WHERE id=用户的id
     */
    @Test
    void selectResultMap2Test(){
        System.out.println(commentMapper.selectResultMap2(100));
    }

    /**
     * 多表ResultMap示例
     * 查询指定用户发布的所有的微博信息, 用户id,用户名, 微博所有字段信息
     */
    @Test
    void selectResultMap3Test(){
        System.out.println(commentMapper.selectResultMap3(100));
    }

    @Test
    void selectResultMap4Test(){
        System.out.println(commentMapper.selectResultMap4(200));
    }
}










