package cn.tedu.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 1.Configuration注解：该类标识为Spring配置类，Spring框架会自动加载此类
 * 2.
 */

@Configuration
@ComponentScan("cn.tedu.spring")
public class SpringConfig {
}
