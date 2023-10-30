package cn.tedu._04weibo.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.xml.crypto.Data;

/**
 * 微博详情页功能的VO类
 */

public class WeiboDetailVO {
    //微博id，微博内容，微博发布时间，用户昵称
    private Long id;
    private String content;
    /*
      1.pattern参数:指定日期时间的格式
        年:y 月:M 日:d 时:H 分:m 秒:s
        小大小, 大小小
        格式1: 2000-01-01 00:00:00
        格式2: 2000/01/01 00:00:00
        格式3: 2000年01月01日00时00分00秒
      2.timezone参数:指定时区
     */
    @JsonFormat(pattern = "yyyy.MM.dd.HH:mm:ss", timezone = "GMT+8")
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
