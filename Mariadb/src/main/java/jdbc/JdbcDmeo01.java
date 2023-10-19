package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDmeo01 {
    public static void main(String[] args) throws Exception{
        //加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/tedu?serverTimezone=Asia/Shanghai&CharacterEncoding=utf8";
        Connection conn= DriverManager.getConnection(url,"root","root");
        System.out.println("连接建立成功");
        //第三步：基于连接对象创建Statement对象
        Statement stmt=conn.createStatement();
        String sql="select * from class";
        ResultSet rs=stmt.executeQuery(sql);
        while (rs.next()){
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
