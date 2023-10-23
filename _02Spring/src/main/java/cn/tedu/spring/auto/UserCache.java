package cn.tedu.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 标识为Spring组件:获取该类的Bean对象
 */

@Component
public class UserCache {
    /*
        1.@Autowired注解:
          只能根据类型进行装配,不能根据Bean对象名称进行装配;
          如果一个接口有多个实现类,则不能使用Autowired注解指定对应的Bean对象,抛出异常!
        2.@Qualifier注解:
          根据Bean对象名称进行装配,经常配合@Autowired注解一起使用;
     */
    @Autowired
    @Qualifier(value = "AAAA")
    private Cache cache;
}







