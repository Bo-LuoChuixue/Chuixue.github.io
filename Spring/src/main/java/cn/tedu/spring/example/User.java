package cn.tedu.spring.example;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.awt.*;

@Component
//@Service
//@Controller
//@Repository
public class User {
    final String YELLOW = "\u001B[93m";
    final String RED_COLOR = "\u001B[31m";
    final String RESET_CODE = "\033[0m";
    public void run(){
        System.out.println(YELLOW+"东方红太阳升"+RESET_CODE+RED_COLOR+"中国出了个毛泽东"+RESET_CODE);
    }
}
