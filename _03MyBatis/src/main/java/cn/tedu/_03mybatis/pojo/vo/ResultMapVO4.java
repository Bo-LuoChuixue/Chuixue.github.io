package cn.tedu._03mybatis.pojo.vo;

import cn.tedu._03mybatis.pojo.entity.Comment;

import java.util.List;

public class ResultMapVO4 {
    private Long id;
    private String content;
    private List<Comment> commentList;

    @Override
    public String toString() {
        return "ResultMapVO4{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", commentList=" + commentList +
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

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
