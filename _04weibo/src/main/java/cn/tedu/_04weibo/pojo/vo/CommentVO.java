package cn.tedu._04weibo.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.xml.crypto.Data;

/**
 * 评论列表的VO类
 */

public class CommentVO {
    //评论id，评论内容，评论时间，用户昵称
    private Long id;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT-8")
    private Data created;
    private String nickname;

    @Override
    public String toString() {
        return "CommentVO{" +
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
