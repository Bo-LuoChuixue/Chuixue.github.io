package cn.tedu.spring.life;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Blog {
    private String name;

    //无参构造
    public Blog() {
        System.out.println("1:调用无参构造实例化");
    }

    //set方法
    @Value("长恨歌")
    public void setName(String name) {
        this.name = name;
        System.out.println("2:通过set方法进行属性赋值");
    }

    // 生命周期初始化方法
    @PostConstruct
    public void init(){
        System.out.println("3:Bean对象初始化时调用此方法");
    }

    // 生命周期销毁方法
    @PreDestroy
    public void destroy(){
        System.out.println("5:Bean对象销毁之前调用此方法");
    }

    @Override
    public String toString() {
        return "Blog{" +
                "name='" + name + '\'' +
                '}';
    }
}










