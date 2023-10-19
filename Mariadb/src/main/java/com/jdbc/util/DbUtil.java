package com.jdbc.util;

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
}
