package com.coffee.baby.pattern.strategy;

import com.coffee.baby.pattern.AbstractFlySimulation;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/5/15 10:51
 **/
public class FighterFlySimulation extends AbstractFlySimulation {
    @Override
    public void takeoff() {
        System.out.println("长距离起飞(LongDistanceTakeOff)");
    }

    @Override
    public void flyspeed() {
        System.out.println("超音速飞行(SuperSonicFly)");
    }
}
