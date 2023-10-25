package cn.tedu._03mybatis.pojo.vo;

import java.util.Date;

public class WeiboVO4 {
    //评论id, 评论内容, 评论时间, 用户昵称
    private Long id;
    private String content;
    private Date created;
    private String nickname;

    @Override
    public String toString() {
        return "WeiboVO4{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
