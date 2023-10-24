package cn.tedu._03mybatis.pojo.vo;

public class CommentVO1 {
    private String content;
    private Long userId;
    private Long weiboId;

    @Override
    public String toString() {
        return "CommentVO1{" +
                "content='" + content + '\'' +
                ", userId=" + userId +
                ", weiboId=" + weiboId +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(Long weiboId) {
        this.weiboId = weiboId;
    }
}
