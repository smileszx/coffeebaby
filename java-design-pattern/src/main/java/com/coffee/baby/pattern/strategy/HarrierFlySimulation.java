package com.coffee.baby.pattern.strategy;


import com.coffee.baby.pattern.AbstractFlySimulation;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/5/15 10:52
 **/
public class HarrierFlySimulation extends AbstractFlySimulation {
    @Override
    public void takeoff() {
        System.out.println("垂直起飞(VerticalTakeOff)");
    }

    @Override
    public void flyspeed() {
        System.out.println("超音速飞行(SuperSonicFly)");
    }
}
