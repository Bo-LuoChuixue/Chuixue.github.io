package cn.tedu._04weibo.pojo.vo;

import javax.xml.crypto.Data;

/**
 * 微博详情页功能的VO类
 */

public class WeiboDetailVO {
    //微博id，微博内容，微博发布时间，用户昵称
    private Long id;
    private String content;
    private Data created;
    private String nickname;

    @Override
    public String toString() {
        return "WeiboDetailVO{" +
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

    public Data getCreated() {
        return created;
    }

    public void setCreated(Data created) {
        this.created = created;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
