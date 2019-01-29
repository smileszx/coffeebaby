package com.coffee.baby.aop;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/29 23:28
 **/
@Slf4j
public class AgvCompass implements CompassInterface {
    @Override
    public void statErrorData() {
        System.out.println("Agv统计异常数据");
    }

    @Override
    public void showErrorResult() {
        System.out.println("Agv展示错误结果");
    }
}
