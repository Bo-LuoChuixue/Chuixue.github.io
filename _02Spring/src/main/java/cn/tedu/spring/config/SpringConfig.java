package cn.tedu.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 1.Configuration注解: 该类标识为Spring配置类,Spring框架会自动加载此类;
 * 2.ComponentScan注解: 自动扫描,会自动扫描该路径以及子孙包下的所有的类,
 *   只要加着四个注解的类,都会被注册为Spring Bean对象.
 */

@Configuration
@ComponentScan("cn.tedu.spring")
public class SpringConfig {
}






