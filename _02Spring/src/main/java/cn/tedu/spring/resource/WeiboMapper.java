package cn.tedu.spring.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * DI注入类
 */
@Repository
public class WeiboMapper {
    /*
        1.首先根据Bean对象名称进行装配(name参数);
        2.如果未指定name参数,则会把属性名[resMapper]作为Bean对象名称进行装配;
        3.属性名和Bean对象名称不一致,则会根据类型[ResMapper]进行装配.
     */
    //@Resource(name = "ZZZZ")
    @Resource
    private ResMapper ZZZZ;
}








