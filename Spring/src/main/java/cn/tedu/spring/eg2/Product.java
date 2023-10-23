package cn.tedu.spring.eg2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
    @Value("屠龙刀")
    private String title;
    @Value("36")
    private Integer num;
    private String comment;

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", num='" + num + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Value("此刀天下有敌")
    public void setComment(String comment) {
        this.comment = comment;
    }
}
