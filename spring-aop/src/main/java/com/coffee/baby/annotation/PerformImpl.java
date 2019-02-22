package com.coffee.baby.annotation;
import org.springframework.stereotype.Component;
/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/2/22 12:53
 **/
@Component
public class PerformImpl implements Performance {
    @Override
    public void perform() {
        System.out.println("请开始你的表演");
    }
}
