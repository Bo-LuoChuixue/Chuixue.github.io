package cn.tedu._03mybatis.pojo.vo;

public class ResultMapVO1 {
    // 微博编号id、内容content、用户编号user_id
    private Long id;
    private String content;
    private Long userId;

    @Override
    public String toString() {
        return "ResultMapVO1{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", userId=" + userId +
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
