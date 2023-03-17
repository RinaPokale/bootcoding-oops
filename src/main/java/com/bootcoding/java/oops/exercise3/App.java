package com.bootcoding.java.oops.exercise3;

public class App {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        for(int i = 0; i < students.length; i++){
            Student s = new Student();
            s.percentage = 58 + i;
            students[i] = s;
        }

        StudentService studentService = new StudentService();
        float criteriaOfPer = 60;
        Student[] s = studentService.findStudentAboveCriteriaOfPer(students, criteriaOfPer);

        System.out.println("List of Students who've got above " + criteriaOfPer +"% :-");
        for(Student st: s){
            if(st != null)
                System.out.println(st.percentage);
        }
    }
}
