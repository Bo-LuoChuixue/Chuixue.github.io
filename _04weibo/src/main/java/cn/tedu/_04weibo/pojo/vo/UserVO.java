package cn.tedu._04weibo.pojo.vo;

public class UserVO {
    /*
     *   1.注册功能: id
     *   2.获取当前用户功能: nickname
     *   3.登录功能: password
     */
    private Long id;
    private String password;
    private String nickname;

    @Override
    public String toString() {
        return "UserVO{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
