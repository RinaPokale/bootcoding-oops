package com.bootcoding.java.oops.abstraction.exercise1;

public class Test {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.start();
        b.speed();

        Vehicle v = new Bicycle();
        v.start();
        v.speed();

    }
}
