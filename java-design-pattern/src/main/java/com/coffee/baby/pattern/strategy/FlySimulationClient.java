package com.coffee.baby.pattern.strategy;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/5/15 10:56
 **/
public class FlySimulationClient {

    public static void main(String[] args) {
        FlySimulationContext context = new FlySimulationContext();
        System.out.println("=========开始直升机模拟飞行============");
        context.setAfs(new HelicopterFlySimulation());
        context.startFlySimlulation();
        System.out.println("=========直升机模拟飞行结束============");
        System.out.println("");

        System.out.println("=========开始客机模拟飞行============");
        context.setAfs(new AirPlaneFlySimulation());
        context.startFlySimlulation();
        System.out.println("=========客机模拟飞行结束============");

        System.out.println("=========开始歼击机模拟飞行============");
        context.setAfs(new FighterFlySimulation());
        context.startFlySimlulation();
        System.out.println("=========歼击机模拟飞行结束============");

        System.out.println("=========开始鹞式战斗机模拟飞行============");
        context.setAfs(new HarrierFlySimulation());
        context.startFlySimlulation();
        System.out.println("=========鹞式战斗机模拟飞行结束============");

    }
}
