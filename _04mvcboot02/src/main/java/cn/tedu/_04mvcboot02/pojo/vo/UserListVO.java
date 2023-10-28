package cn.tedu._04mvcboot02.pojo.vo;

/**
 * 获取用户列表的VO类
 */
public class UserListVO {
    private String username;
    private String password;

    @Override
    public String toString() {
        return "UserListVO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}






