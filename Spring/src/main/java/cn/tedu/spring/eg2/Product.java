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

    @Value("此刀天下有敌")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", num='" + num + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
