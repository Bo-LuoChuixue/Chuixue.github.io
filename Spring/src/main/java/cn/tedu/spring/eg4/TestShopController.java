package cn.tedu.spring.eg4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestShopController {
    public static void main(String[] args) {
        final String RED_COLOR = "\u001B[31m";
        final String RESET_CODE = "\033[0m";
    AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("cn.tedu.spring.eg4");
    ShopController shopController=context.getBean(ShopController.class);
        System.out.println(RED_COLOR+"第四步：使用——"+shopController+RESET_CODE);
        context.close();
    }
}
