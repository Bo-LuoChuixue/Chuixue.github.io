package cn.tedu.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope (value = "singleton")  //单例
//@Scope(value = "prototype")   //多例
public class Order {
    private String status;
}
