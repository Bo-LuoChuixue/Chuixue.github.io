package cn.tedu._03mybatis;

import cn.tedu._03mybatis.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ResultMapTests {
    @Autowired
    private CommentMapper commentMapper;

    @Test
    void selectResultMap1Test(){
        System.out.println(commentMapper.selectResultMap1(200));
    }

    @Test
    void selectResultMap2Test(){
        System.out.println(commentMapper.selectResultMap2(100));
    }
}
