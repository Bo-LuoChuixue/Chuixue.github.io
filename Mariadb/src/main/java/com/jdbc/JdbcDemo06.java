package com.jdbc;

import com.jdbc.util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 要求使用JDBC技术向class表中写入一条数据并且要防止SQL注入
 */

public class JdbcDemo06 {
    public static void main(String[] args) throws SQLException {
        String sql="insert into class(id,name,floor,teacher_id) values (?,?,?,?)";
        try (Connection conn= DbUtil.getConnection();
        PreparedStatement pstmt=conn.prepareStatement(sql);){
            pstmt.setInt(1,2);
            pstmt.setString(2,"B");
            pstmt.setInt(3,3);
            pstmt.setInt(4,1);
            int rows=pstmt.executeUpdate();
            System.out.println(ColorUtil.colorize("insert ok,rows="+rows,ColorUtil.SKY_BLUE));
        }catch (SQLException e){
            e.printStackTrace();
            throw e;
        }
    }
}
