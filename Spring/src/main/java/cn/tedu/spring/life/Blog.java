package cn.tedu.spring.life;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Blog {
    public static final String SKY_BLUE = "\u001B[34m";
    final String INDIGO_COLOR = "\u001B[38;5;68m";
    final String PURPLE = "\u001B[35m";
    final String GREEN_COLOR = "\u001B[32m";
    final String RESET_CODE = "\033[0m";
    private String name;

    public Blog() {
        System.out.println(SKY_BLUE+"1：调用无参构造进行实例化"+RESET_CODE);
    }

    @Value("长恨歌")
    public void setName(String name) {
        this.name = name;
        System.out.println(GREEN_COLOR+"2：通过set方法进行属性赋值"+RESET_CODE);
    }

    //生命周期初始化方法
    @PostConstruct
    public void init(){
        System.out.println(PURPLE+"3：Bean初始化时调用此方法"+RESET_CODE);
    }

    //生命周期销毁方法
    @PreDestroy
    public void destroy(){
        System.out.println(INDIGO_COLOR+"5：Bean对象销毁之前调用此方法"+RESET_CODE);
    }

    @Override
    public String toString() {
        return "Blog{" +
                "name='" + name + '\'' +
                '}';
    }
}
