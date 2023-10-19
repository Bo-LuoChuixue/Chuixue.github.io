package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDemo04 {
    static void deleteById(String id)throws Exception{
        String url="jdbc:mysql://localhost:3306/tedu?" + "serverTimezone=Asia/Shanghai&CharacterEncoding=utf8";
        Connection conn= DriverManager.getConnection(url,"root","root");
        System.out.println("连接建立OK");
        String sql="delete from class where id=?";//"?"代表占位符
        PreparedStatement stmt= conn.prepareStatement(sql);
        stmt.setObject(1,id);
        int rows=stmt.executeUpdate();
        System.out.println(ColorUtil.colorize("删除的行数="+rows,ColorUtil.PINK));
        stmt.close();
        conn.close();
    }
    public static void main(String[] args) throws Exception{
        //String id="4";
        String id="4 or 1=1";
        deleteById(id);
    }
}
