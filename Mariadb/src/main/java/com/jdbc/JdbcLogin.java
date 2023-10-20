package com.jdbc;

import com.jdbc.util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * 实现登录功能
 * 1.接收用户输入【用户名、密码】
 * 2.创建数据库连接对象
 * 3.定义编译SQL语句
 * 4.创建预编译SQL执行对象
 * 5.执行SQL语句executeQuery()
 * 6.判断查询结果【Result】
 */

public class JdbcLogin {
    public static void main(String[] args) {
        //壹.接收用户输入
        Scanner scanner=new Scanner(System.in);
        System.out.println(ColorUtil.colorize("请输入用户名：",ColorUtil.INDIGO_COLOR));
        String username= scanner.nextLine();
        System.out.println(ColorUtil.colorize("请输入密码：",ColorUtil.RED_COLOR));
        String password=scanner.nextLine();

        //贰.连接并操作数据库
        try {
            //1.创建数据库连接对象
            Connection connection = DbUtil.getHikariConnection();
            //2.执行预编译SQL语句
            String sql="select id from user where username=? and password=?";
            PreparedStatement ps= connection.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet resultSet = ps.executeQuery();
            //3.获取执行结果
            if(resultSet.next()){
                System.out.println(ColorUtil.colorize("登陆成功！",ColorUtil.YELLOW));
            }else {
                System.out.println(ColorUtil.colorize("用户名或密码错误！",ColorUtil.PURPLE));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
