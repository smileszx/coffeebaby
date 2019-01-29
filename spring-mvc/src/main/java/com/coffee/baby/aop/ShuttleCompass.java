package com.coffee.baby.aop;

import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/30 0:07
 **/
@Component
public class ShuttleCompass implements CompassInterface {
    @Override
    public void statErrorData() {
        System.out.println("Shuttle 统计错误数据");
    }

    @Override
    public void showErrorResult() {

        System.out.println("Shuttle 展示错误结果");
    }
}
