package com.coffee.baby.collections;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/31 23:25
 **/
public class BenzCar implements Cloneable{

    private String price;

    private String location;

    public BenzCar(String location , String price) {
        this.location = location;
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "BenzCar{" +
                "price='" + price + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    protected BenzCar clone() {
        BenzCar clone = null;
        try {
            clone = (BenzCar) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
