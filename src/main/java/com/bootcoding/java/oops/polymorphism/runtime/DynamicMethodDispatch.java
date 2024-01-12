package com.bootcoding.java.oops.polymorphism.runtime;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();

        Splendor splendor = new Splendor();
        splendor.run();
//        splendor.startS();

        Bike b = new Splendor(); //upcasting
        b.run();
        b.start();
//        ((Splendor)b).startS();

    }

/*
The start() is called based on the type of the reference variable b (which is Bike).
 If there were an overridden start() in the Splendor class, it would be called at runtime based on the
 actual type of the object (Splendor) that b refers to.
 */


    private static Bike getBike() {
        return new Splendor();
    }
}

/*
The method resolution is based on the type of the reference, not the type of the actual object
that b refers to at runtime. This is known as compile-time polymorphism or static polymorphism.
In Java, the choice of which method to call is determined at compile-time for methods that are not overridden.
The start method in the Bike class is not overridden in the Splendor class, so the compiler will look at the
type of the reference variable (Bike b) and choose the appropriate method based on that type.

If the start method were overridden in the Splendor class, then the method call would be resolved
at runtime (dynamic polymorphism) based on the actual type of the object that b refers to.
 */
