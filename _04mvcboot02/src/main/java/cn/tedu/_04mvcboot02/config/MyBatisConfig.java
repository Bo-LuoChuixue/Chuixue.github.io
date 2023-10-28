package cn.tedu._04mvcboot02.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 设置自动扫描
 * Configuration注解:标识该类为配置类,工程启动时会自动加载此类;
 * MapperScan注解:
 *   1.自动扫描注解,工程启动之会自动扫描指定包及子孙包;
 *   2.自动为接口添加 @Mapper 注解;
 *   3.使用此注解后,所有的接口上无需再添加 @Mapper 注解;
 */
@Configuration
@MapperScan("cn.tedu._04mvcboot02")
public class MyBatisConfig {
}








