package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 要求使用JDBC技术向class表中写入一条数据并且要防止SQL注入
 */

public class JdbcDemo05 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/tedu?serverTimezone=Asia/Shanghai&characterEncoding=utf8";
        String username="root";
        String password="root";
        Connection conn=null;
        PreparedStatement pstmt=null;
        String sql="insert into class(id,name,floor,teacher_id) values (?,?,?,?)";
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("连接建立OK");
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,2);
            pstmt.setString(2,"B");
            pstmt.setInt(3,3);
            pstmt.setInt(4,1);
            int rows=pstmt.executeUpdate();
            System.out.println(ColorUtil.colorize("insert ok,rows="+rows,ColorUtil.SKY_BLUE));
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //释放资源
            if(conn!=null)try{conn.close();}catch (SQLException e){}
            if(pstmt!=null)try{pstmt.close();}catch (SQLException e){}
        }
    }
}
