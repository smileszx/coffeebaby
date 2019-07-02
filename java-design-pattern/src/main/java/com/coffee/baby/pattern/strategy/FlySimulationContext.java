package com.coffee.baby.pattern.strategy;


import com.coffee.baby.pattern.AbstractFlySimulation;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/5/15 10:54
 **/
public class FlySimulationContext {

    private AbstractFlySimulation afs;

    public void setAfs(AbstractFlySimulation afs) {
        this.afs = afs;
    }

    public void startFlySimlulation(){
        afs.takeoff();
        afs.flyspeed();
    }
}
