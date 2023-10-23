package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 基于班级id删除班级信息
 */
public class JdbcDemo03 {
    static void deleteById(String id)throws Exception{
        String url="jdbc:mysql://localhost:3306/tedu?" + "serverTimezone=Asia/Shanghai&CharacterEncoding=utf8";
        Connection conn=DriverManager.getConnection(url,"root","root");
        System.out.println("连接建立OK");
        Statement stmt=conn.createStatement();
        String sql="delete from class where id="+id;
        int rows=stmt.executeUpdate(sql);
        System.out.println("删除的行数="+rows);
        stmt.close();
        conn.close();
    }
    public static void main(String[] args) throws Exception{
        //String id="4";
        String id="4 or 1=1";//id值该如何写,能够将class表中的数据全部删除(可以查SQL注入这个概念)
        deleteById(id);
        //通过字符串拼接方式修改sql语义,进而破坏数据库中的数据,我们把这种现象称之为SQL注入.
    }
}
