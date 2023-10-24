package cn.tedu._03mybatis;

import cn.tedu._03mybatis.mapper.UserMapper;
import cn.tedu._03mybatis.mapper.WeiboMapper;
import cn.tedu._03mybatis.pojo.entity.User;
import cn.tedu._03mybatis.pojo.entity.Weibo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;

@SpringBootTest
class ApplicationTests {
	@Autowired
	private UserMapper userMapper;


	@Test
	void contextLoads() {
	}

	/**
	 * 测试方法：在用户表中插入一条数据
	 * 所有的测试方法要求无参无返回值
	 */
	@Test
	void insertUserTest(){
		User user=new User();
		user.setUsername("裴珠泫");
		user.setPassword("19910329");
		user.setNickname("Irene");
		user.setCreated(new Date());
		userMapper.insertUser(user);//调用接口方法
	}

	@Autowired
	private WeiboMapper weiboMapper;

	@Test
	void insertWeiboTest(){
		Weibo weibo = new Weibo();
		weibo.setContent("如果有一天我变得很有钱\n我会想尽一切办法倒流时间");
		weibo.setCreated(new Date());
		weibo.setUserId(100L);
		System.out.println(weiboMapper.insertWeibo(weibo));
	}

	/*
	    根据微博id删除1条微博
	 */
	@Test
	void deleteByIdTest(){
		System.out.println(weiboMapper.deleteById(207));
	}

	/*
        根据微博id修改微博数据
     */
	@Test
	void updateByIdTest () {
		Weibo weibo=new Weibo();
		weibo.setId(207L);
		weibo.setContent("让所有可怜的孩子不再胆怯\n所有邪恶的人不再掌握话语权");
		weibo.setCreated(new Date());
		weibo.setUserId(100L);
		System.out.println(weiboMapper.updateById(weibo));
	}

	/*
        根据微博id查询1条微博
     */
	@Test
	void selectByIdTest(){
		System.out.println(weiboMapper.selectById(206));
	}

	/*
        查询所有微博信息
     */
	@Test
	void selectAllTest(){
		System.out.println(weiboMapper.selectAll());
	}

	/*
        指定字段查询：
        查询指定微博id的 内容content和发布时间created
     */
	@Test
	void selectByWidTest(){
		System.out.println(weiboMapper.selectByWid(200));
	}

	/**
	 * 查询指定用户【用户id】发的所有微博信息【微博id，微博内容，微博发布时间】
	 */
	@Test
	void selectByUidTest(){
		System.out.println(weiboMapper.selectByUid(100));
	}
}