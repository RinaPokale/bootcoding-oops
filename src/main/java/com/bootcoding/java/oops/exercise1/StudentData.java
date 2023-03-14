package com.bootcoding.java.oops.exercise1;

public class StudentData {
    int roll_no;
    String name;
    String address;
    float percentage;

    public void print(StudentData studentData){
        System.out.println("Roll_no:- " +studentData.roll_no);
        System.out.println("Name:- " +studentData.name);
        System.out.println("Percentage:- " +studentData.percentage);
        System.out.println("Address:- " +studentData.address);
    }
}
