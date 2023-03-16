package com.bootcoding.java.oops.exercise2;

public class Faculty {
    public void startProjector(Projector projector){
        System.out.println("Starting projector");
    }

    public void startProjector(String name){
        System.out.println(name + " has been started");
    }

    public void removeProjector(Projector[] ps){
        System.out.println("Removing Projectors");
        for(Projector s: ps) {
            System.out.println(s.name);
        }
        System.out.println();
    }
}
