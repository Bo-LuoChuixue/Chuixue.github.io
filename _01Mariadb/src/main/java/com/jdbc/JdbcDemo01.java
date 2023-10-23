package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo01 {
    public static void main(String[] args) throws Exception{
        //第一步：加载驱动程序（"com.mysql.cj.jdbc.Driver"）
        Class.forName("com.mysql.cj.jdbc.Driver");
        //第二步：通过驱动建立连接（比较耗时-TCP/IP）
        String url="jdbc:mysql://localhost:3306/tedu?" + "serverTimezone=Asia/Shanghai&CharacterEncoding=utf8";
        Connection conn= DriverManager.getConnection(url,"root","root");
        System.out.println("连接建立成功");
        //第三步：基于连接对象创建Statement对象
        Statement stmt=conn.createStatement();
        //第四步：基于Statement对象发送sql（发送到数据库端）
        String sql="select * from class";
        ResultSet rs=stmt.executeQuery(sql);//执行查询操作是调用此方法，返回值ResultSet
        //处理结果
        while (rs.next()){ //rs.next()执行一次取一次
            System.out.print(rs.getInt("id")+"|");
            System.out.print(rs.getString("name")+"|");
            System.out.print(rs.getInt("floor")+"|");
            System.out.println(rs.getInt("teacher_id")+"|");
        }
        //第六步：释放资源（先创建后关闭）
        rs.close();
        stmt.close();
        conn.close();
    }
}
