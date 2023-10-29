package cn.tedu._03mybatis.pojo.vo;

import java.util.Date;

public class WeiboVO3 {
    //内容, 发布时间, 用户昵称
    private String content;
    private Date created;
    private String nickname;

    @Override
    public String toString() {
        return "WeiboVO3{" +
                "content='" + content + '\'' +
                ", created=" + created +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
