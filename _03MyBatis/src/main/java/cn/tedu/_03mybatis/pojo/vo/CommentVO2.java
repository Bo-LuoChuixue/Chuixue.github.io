package cn.tedu._03mybatis.pojo.vo;

public class CommentVO2 {
    private String content;
    private Long userId;

    @Override
    public String toString() {
        return "CommentVO2{" +
                "content='" + content + '\'' +
                ", userId=" + userId +
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
}
