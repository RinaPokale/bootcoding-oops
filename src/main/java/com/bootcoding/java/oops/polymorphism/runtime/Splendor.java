package com.bootcoding.java.oops.polymorphism.runtime;

public class Splendor extends Bike{
    @Override
    void run() {
//        super.run();
        System.out.println("splendor running safely with high speed");
    }

    public void startS(){
        System.out.println("started s");
    }
}
