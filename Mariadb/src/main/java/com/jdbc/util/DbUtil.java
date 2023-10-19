package com.jdbc.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 定义工具类，封装数据库连接的获取
 */

public class DbUtil {
    public static Connection getConnection()throws SQLException {
        String url="jdbc:mysql://localhost:3306/tedu?" + "serverTimezone=Asia/Shanghai&characterEncoding=utf8";
        String username="root";
        String password="root";
        return DriverManager.getConnection(url, username, password);
    }
    private static HikariDataSource dataSource;
    static {
        HikariConfig config=new HikariConfig("/hikari.properties");//加载配置文件
//        HikariConfig config=new HikariConfig();
//        config.setJdbcUrl("jdbc:mysql://localhost:3306/tedu?serverTimezone=Asia/Shanghai&characterEncoding=utf8");
//        config.setUsername("root");
//        config.setPassword("root");
        dataSource=new HikariDataSource(config);//创建数据源对象（通过此对象获取连接）
    }
    public static Connection getHikariConnection()throws SQLException {
        return dataSource.getConnection();
    }

    public static void main(String[] args) throws SQLException {
       Connection conn = getHikariConnection();
        System.out.println(conn);
    }
}
