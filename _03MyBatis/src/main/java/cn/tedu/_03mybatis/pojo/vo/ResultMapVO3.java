package cn.tedu._03mybatis.pojo.vo;

import cn.tedu._03mybatis.pojo.entity.Weibo;

import java.util.List;

public class ResultMapVO3 {
    //用户id,用户名username,微博集合List
    private Long id;
    private String username;
    //存放指定用户发布的所有的微博信息的集合
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
