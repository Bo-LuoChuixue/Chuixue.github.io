package cn.tedu._04weibo.pojo.dto;

/**
 * 发表评论DTO类
 */

public class CommentDTO {
    private Long weiboId;
    private String content;

    @Override
    public String toString() {
        return "CommentDTO{" +
                "weiboId=" + weiboId +
                ", content='" + content + '\'' +
                '}';
    }

    public Long getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(Long weiboId) {
        this.weiboId = weiboId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
