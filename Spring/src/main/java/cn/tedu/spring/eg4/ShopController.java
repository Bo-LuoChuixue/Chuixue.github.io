package cn.tedu.spring.eg4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ShopController {
    final String GREEN_COLOR = "\u001B[32m";
    final String YELLOW = "\u001B[93m";
    String PURPLE = "\u001B[35m";
    final String RESET_CODE = "\033[0m";

    private String inventory;

    public ShopController() {
        System.out.println(PURPLE+"第一步：实例化"+RESET_CODE);
    }

    @Value("肉灵芝")
    public void setInventory(String inventory) {
        this.inventory = inventory;
        System.out.println(GREEN_COLOR+"第二步：属性赋值"+RESET_CODE);
    }

    @PostConstruct
    public void price(){
        System.out.println("第三步：初始化");
    }

    @PreDestroy
    public void destruction(){
        System.out.println(YELLOW+"第五步：销毁"+RESET_CODE);
    }

    @Override
    public String toString() {
        return "ShopController{" +
                "inventory='" + inventory + '\'' +
                '}';
    }
}
