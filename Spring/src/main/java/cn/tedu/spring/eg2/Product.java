package cn.tedu.spring.eg2;

import cn.tedu.spring.example.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
    @Value("倚天剑")
    private String title;
    @Value("20")
    private Integer num;
    private String comment;

    @Override
    public String toString() {
        return "Porduct{" +
                "title='" + title + '\'' +
                ", num=" + num +
                ", comment='" + comment + '\'' +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Value("配合屠龙刀使用更佳")
    public void setComment(String comment) {
        this.comment = comment;
    }
}








