package cn.tedu.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * DI注入类
 * Scope注解: 作用域注解
 *   1.singleton: 单例模式[默认],Bean对象只有1个
 *     创建IoC容器时,创建Bean对象;
 *   2.prototype: 多例模式,Bean对象有多个
 *     每次在IoC容器中获取Bean对象时[getBean(类名.class)], 才会创建Bean对象
 *   平时写项目时,使用框架的单例模式.
 */
//@Scope(value = "prototype")
@Scope(value = "singleton")
@Component
public class Order {
    private String status;
}






