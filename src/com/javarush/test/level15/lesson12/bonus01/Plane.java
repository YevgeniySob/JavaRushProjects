package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by yevge on 2/23/2016.
 */
public class Plane implements Flyable {

    public int numberOfPassengers;

    public Plane(int num) {
        this.numberOfPassengers = num;
    }

    @Override
    public void fly() {

    }
}
