package cn.tedu._04mvcboot02.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 设置自动扫描
 */

@Configuration
@MapperScan("cn.tedu._04mvcboot02")
public class MyBatisConfig {
}
