package cn.tedu._03mybatis.pojo.vo;

import java.util.Date;

public class WeiboVO1 {
    //查询内容content和发布时间created
    private String content;
    private Date created;

    @Override
    public String toString() {
        return "WeiboVO1{" +
                "content='" + content + '\'' +
                ", created=" + created +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
