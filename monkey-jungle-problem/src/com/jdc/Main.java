package com.jdc;

class Person{

}

class Student extends Person{
    public void study(){
        System.out.println("Student is studying" +
                "");
    }
}

class JavaStudent extends Student{

}

public class Main {
    static void main() {
        test(new Student());
//        test(new Person()); classcastexception
        test(new Person());
    }

    public static void test(Person p){
        if(p instanceof Student s){ //started at java 13
            s.study();
        } else {
            System.out.println("Wrong Object");
        }
//        ((Student) p).study();
    }
}
