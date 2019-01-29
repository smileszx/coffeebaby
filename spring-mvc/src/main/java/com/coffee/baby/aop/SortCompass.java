package com.coffee.baby.aop;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/29 23:29
 **/
public class SortCompass implements CompassInterface {
    @Override
    public void statErrorData() {
        System.out.println("Sort统计异常数据");
    }

    @Override
    public void showErrorResult() {
        System.out.println("Sort展示错误结果");

    }
}
