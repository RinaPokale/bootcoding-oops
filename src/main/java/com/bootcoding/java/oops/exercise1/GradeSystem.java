package com.bootcoding.java.oops.exercise1;

public class GradeSystem {
    public char findGrade(StudentData stD){
        if(stD.percentage >= 90){
            return 'A';
        } else if (stD.percentage >= 70) {
            return 'B';
        }
        return 'C';
    }

}