package cn.tedu._04weibo.pojo.vo;

/**
 * 微博首页列表展示功能的VO类
 */
public class WeiboIndexVO {
    //微博id,微博内容,用户昵称
    private Long id;
    private String content;
    private String nickname;

    @Override
    public String toString() {
        return "WeiboIndexVO{" +
                "id=" + id +
                ", content='" + content + '\'' +
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}







