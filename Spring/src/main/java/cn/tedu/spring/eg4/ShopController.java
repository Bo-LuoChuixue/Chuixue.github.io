package cn.tedu.spring.eg4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ShopController {
    private String name;

    public ShopController() {
        System.out.println("1:实例化");
    }

    @Value("达达商店")
    public void setName(String name) {
        this.name = name;
        System.out.println("2:属性赋值");
    }

    @PostConstruct
    public void init(){
        System.out.println("3:初始化");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("5:销毁");
    }

    @Override
    public String toString() {
        return "ShopController{" +
                "name='" + name + '\'' +
                '}';
    }
}
