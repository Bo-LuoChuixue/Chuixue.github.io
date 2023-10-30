package cn.tedu._04weibo.pojo.dto;

/**
 * 发布微博的DTO类
 */
public class InsertWeiboDTO {
    //微博内容
    private String content;

    @Override
    public String toString() {
        return "InsertWeiboDTO{" +
                "content='" + content + '\'' +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}








