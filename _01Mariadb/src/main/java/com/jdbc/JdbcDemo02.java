package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JdbcDemo02 {
    public static void main(String[] args) throws Exception {
        //第一步：加载驱动程序（"com.mysql.cj.jdbc.Driver"）
        Class.forName("com.mysql.cj.jdbc.Driver");
        //第二步：通过驱动建立连接（比较耗时-TCP/IP）
        String url="jdbc:mysql://localhost:3306/tedu?" + "serverTimezone=Asia/Shanghai&CharacterEncoding=utf8";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        System.out.println("连接建立成功");
        //第三步：基于连接对象创建Statement对象
        Statement stmt = conn.createStatement();
        //第四步：基于Statement对象发送sql（发送到数据库端）
        String sql = "select * from class";
        ResultSet rs = stmt.executeQuery(sql);//执行查询操作是调用此方法，返回值ResultSet
        //处理结果
        List<Map<String, Object>> list = new ArrayList<>();
        while (rs.next()) { //循环一次取一行，一行记录映射为1个map（行映射），多个map放到list集合
            Map<String, Object> map = new HashMap<>();
            map.put("id",rs.getInt("id"));
            map.put("name",rs.getString("name"));
            map.put("floor",rs.getInt("floor"));
            map.put("teacher_id",rs.getInt("teacher_id"));
            list.add(map);
        }
//        System.out.println(list);
//        list.forEach((map)-> System.out.println(map));
        list.forEach(System.out::println);
        //第六步：释放资源（先创建后关闭）
        rs.close();
        stmt.close();
        conn.close();
    }
}
