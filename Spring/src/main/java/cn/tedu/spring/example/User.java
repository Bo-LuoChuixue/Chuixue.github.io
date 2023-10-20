package cn.tedu.spring.example;

import org.springframework.stereotype.Component;

@Component
public class User {
    final String YELLOW = "\u001B[93m";
    final String RESET_CODE = "\033[0m";
    public void run(){
        System.out.println(YELLOW+"东方红太阳升 中国出了个毛泽东"+RESET_CODE);
    }
}
