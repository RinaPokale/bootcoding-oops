package com.bootcoding.java.oops.exercise1;

public class Application {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            StudentData s = new StudentData();
            s.roll_no = i;
            s.name = "Name" + i;
            s.percentage = 87 + i;
            s.address = "Nagpur";
            s.print(s);
            GradeSystem g = new GradeSystem();
            char grade = g.findGrade(s);
            System.out.println("Grade:- " +grade);
            System.out.println();
        }

    }
}

