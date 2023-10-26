package cn.tedu._04mvcboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BMIController {
    /*@RequestMapping("/bmi")
    @ResponseBody
    public String bmi(Double height,Double weight){
        Double bmi=weight/(height*height);
        if (bmi<18.5){
            return "偏瘦";
        }
        if (bmi<24){
            return "正常";
        }
        if (bmi<27){
            return "微胖";
        }
        return "该减肥了";
    }*/

    @RequestMapping("/bmi")
    @ResponseBody
    public String bmi(BMIDto bmiDto){
        Double height=bmiDto.getHeight();
        Double weight= bmiDto.getWeight();
        double bmi=weight/(height*height);
        if (bmi<18.5){
            return "偏瘦";
        }
        if (bmi<24){
            return "正常";
        }
        if (bmi<27){
            return "微胖";
        }
        return "该减肥了";

    }
}
