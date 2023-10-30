package cn.tedu._03mybatis;

import cn.tedu._03mybatis.mapper.CommentMapper;
import cn.tedu._03mybatis.mapper.UserMapper;
import cn.tedu._03mybatis.mapper.WeiboMapper;
import cn.tedu._03mybatis.pojo.entity.Comment;
import cn.tedu._03mybatis.pojo.entity.User;
import cn.tedu._03mybatis.pojo.entity.Weibo;
import cn.tedu._03mybatis.pojo.vo.CommentVO1;
import cn.tedu._03mybatis.pojo.vo.CommentVO2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    /**
     * 测试方法:在用户表中插入1条数据;
     * 要求:所有的测试方法要求 无参无返回值
     */
    @Test
    void insertUserTest(){
        User user = new User();
        user.setUsername("晶晶");
        user.setPassword("123456");
        user.setNickname("白晶晶");
        user.setCreated(new Date());
        //调用接口方法
        userMapper.insertUser(user);
    }

    @Autowired
    private WeiboMapper weiboMapper;

    @Test
    void insertWeiboTest(){
        Weibo weibo = new Weibo();
        weibo.setContent("还记得许多年前的春天");
        weibo.setCreated(new Date());
        weibo.setUserId(100L);
        System.out.println(weiboMapper.insertWeibo(weibo));
    }

    /**
     * 根据id删除1条微博测试方法
     */
    @Test
    void deleteByIdTest(){
        System.out.println(weiboMapper.deleteById(208));
    }

    /**
     * 根据微博id修改微博数据测试
     */
    @Test
    void updateByIdTest(){
        Weibo weibo = new Weibo();
        weibo.setId(200L);
        weibo.setContent("十年生死两茫茫,不思量自难忘");
        weibo.setCreated(new Date());
        //weibo.setUserId(100L);
        System.out.println(weiboMapper.updateById(weibo));
    }

    /**
     * 根据微博id查询1条微博的信息,要求显示所有字段[id,content,created,user_id]测试
     */
    @Test
    void selectByIdTest(){
        System.out.println(weiboMapper.selectById(200));
    }

    /**
     * 查询所有微博的信息[id,content,created,user_id]测试
     */
    @Test
    void selectAllTest(){
        System.out.println(weiboMapper.selectAll());
    }

    /**
     * 查询指定微博[id]的 内容content和发布时间created测试
     */
    @Test
    void selectByWidTest(){
        System.out.println(weiboMapper.selectByWid(200));
    }

    /**
     * 查询指定用户[用户id]发的所有微博信息:[微博id,微博内容,微博发布时间]测试
     */
    @Test
    void selectByUidTest(){
        System.out.println(weiboMapper.selectByUid(100));
    }

    @Autowired
    private CommentMapper commentMapper;

    /**1. 插入: `insertComment` , 在评论表中插入1条数据;*/
    @Test
    void insertComment(){
        Comment comment = new Comment();
        comment.setContent("高手都在评论区呀");
        comment.setCreated(new Date());
        comment.setUserId(100L);
        comment.setWeiboId(200L);
        System.out.println(commentMapper.insertComment(comment));
    }

    /**2. 删除: `deleteById` , 根据id删除1条评论;*/
    @Test
    void deleteById(){
        System.out.println(commentMapper.deleteById(305));
    }

    /**3. 修改: `updateById` , 根据id修改评论信息;*/
    @Test
    void updateById(){
        Comment comment = new Comment();
        comment.setId(304L);
        comment.setContent("人生就像一场戏,因为有缘才相聚");
        comment.setCreated(new Date());
        comment.setUserId(100L);
        comment.setWeiboId(200L);
        System.out.println(commentMapper.updateById(comment));

    }

    /**4. 查询:  `selectCommentById1`，根据评论的id查询评论的 **内容、用户ID、微博ID**（数据库表中确认）*/
    @Test
    void selectCommentById1() {
        System.out.println(commentMapper.selectCommentById1(300));
    }

    /**5. 查询 `selectCommentById2`，根据微博的id查询评论的 **内容、用户ID**（数据库表中确认）*/
    @Test
    void selectCommentById2(){
        System.out.println(commentMapper.selectCommentById2(200));
    }

    /**
     * 动态修改
     */
    @Test
    void dynamicUpdateTest(){
        Weibo weibo = new Weibo();
        weibo.setId(200L);
        weibo.setContent("如果你为门中弟子伤她一分,我便屠你满门");
        weibo.setCreated(new Date());
        System.out.println(weiboMapper.dynamicUpdate(weibo));
    }

    /**
     * 动态删除1:数组方式
     */
    @Test
    void dynamicDelete1Test(){
        Integer[] ids = {203, 205, 207};
        System.out.println(weiboMapper.dynamicDelete1(ids));
    }

    /**
     * 动态删除2: List集合方式
     */
    @Test
    void dynamicDelete2(){
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(205);
        ids.add(288);
        ids.add(366);
        System.out.println(weiboMapper.dynamicDelete2(ids));
    }

    /**
     * 统计微博数量
     */
    @Test
    void selectCountTest(){
        System.out.println(weiboMapper.selectCount());
    }

    /**
     * 多表查询:
     * 微博详情页面: 根据微博的id, 查询该条微博的  内容, 发布时间, 用户昵称
     */
    @Test
    void selectWeiboByIdTest(){
        System.out.println(weiboMapper.selectWeiboById(200));
    }
    /**
     * 多表查询
     * 根据微博的ID, 获取该条微博的所有评论:  评论id, 评论内容, 评论时间, 用户昵称
     */
    @Test
    void selectCommentTest(){
        System.out.println(weiboMapper.selectComment(200));
    }
}







