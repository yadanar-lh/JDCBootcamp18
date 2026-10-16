package com.jdc;
/*
Encapsulation
 */

public class Main {
    static void main() {
//        Employee e1 = new Employee();
//        e1.setName("John Doe");
//        e1.setSalary(2000); //Invoke
//
//        Employee e2 = new Employee();
//        e2.setName("Thomas Hardy");
//        e2.setSalary(3000);
//
//        System.out.println("Name : %s\nSalary : %d".formatted(e1.getName(), e1.getSalary()));
//        System.out.println();
//        System.out.println("Name : %s\nSalary : %d".formatted(e2.getName(), e2.getSalary()));

        Student s1 = new Student();
        s1.setName("Yadanar Lin Htet");
        s1.setSchool("NMDC");
        s1.setGrade(12);

        Student s2 = new Student();
        s2.setName("Cho Cho San");
        s2.setSchool("TU");
        s2.setGrade(12);

        Student s3 = new Student("Khaing", "Hlaing", 10);
        Student s4 = new Student("May","YU",11);

        System.out.println("Name : %s\nSchool : %s\nGrade : %d".formatted(s1.getName(),s1.getSchool(),s1.getGrade()));
        System.out.println();
        System.out.println("Name : %s\nSchool : %s\nGrade : %d".formatted(s2.getName(),s2.getSchool(),s2.getGrade()));
        System.out.println();
        System.out.println("Name : %s\nSchool : %s\nGrade : %d".formatted(s3.getName(),s3.getSchool(),s3.getGrade()));
        System.out.println();
        System.out.println("Name : %s\nSchool : %s\nGrade : %d".formatted(s4.getName(),s4.getSchool(),s4.getGrade()));


    }
}
