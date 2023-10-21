package cn.tedu.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestOrder {
    public static void main(String[] args) {
        final String GREEN_COLOR = "\u001B[32m";
        final String INDIGO_COLOR = "\u001B[38;5;68m";
        final String RESET_CODE = "\033[0m";

        ApplicationContext context=new AnnotationConfigApplicationContext("cn.tedu.spring.scope");
        Order order1 = context.getBean(Order.class);
        System.out.println(GREEN_COLOR+order1+RESET_CODE);
        Order order2 = context.getBean(Order.class);
        System.out.println(INDIGO_COLOR+order2+RESET_CODE);
    }
}
