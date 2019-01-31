package com.coffee.baby.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Description
 * HashSet构造方法的拷贝是浅拷贝
 * @Author Thinkpad
 * @Date 2019/1/31 23:24
 **/
public class HashSetCloneTest {


    public static void main(String[] args) {
        Set<BenzCar> set = new HashSet<>();

        set.add(new BenzCar("China", "1000000RMB"));
        set.add(new BenzCar("USA", "10$"));


        Collection<BenzCar> newSet = new HashSet<>(set.size());
        newSet = (Collection<BenzCar>) ((HashSet<BenzCar>) set).clone();

        System.out.println("HashSet clone method: " + newSet);


//        Collection<BenzCar> cars = new HashSet<>(set.size());

        System.out.println("Original: " + set);
//        System.out.println("Copy: " + cars);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            BenzCar car = (BenzCar) iterator.next();
            System.out.println(car);
//            cars.add(car.clone());
            car.setLocation("=> " + car.getLocation());
            car.setPrice("=> " + car.getPrice());
        }

        System.out.println("Original: " + set);
        System.out.println("HashSet clone method: " + newSet);
//        System.out.println("Copy: " + cars);
    }
}
