package cn.tedu._03mybatis.pojo.vo;

import cn.tedu._03mybatis.pojo.entity.Weibo;
import java.util.List;

public class ResultMapVO3 {
    private Long id;
    private String username;
    private List<Weibo> weiboList;

    @Override
    public String toString() {
        return "ResultMapVO3{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", weiboList=" + weiboList +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Weibo> getWeiboList() {
        return weiboList;
    }

    public void setWeiboList(List<Weibo> weiboList) {
        this.weiboList = weiboList;
    }
}
