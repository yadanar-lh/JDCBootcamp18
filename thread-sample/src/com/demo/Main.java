package com.demo;

public class Main {
    static void main() {
        var ob1 = new MyThreadClass("A");
        var ob2 = new MyThreadClass("B");
        var ob3 = new MyThreadClass("C");

        try{
            System.out.println("ob1 is alive? " + ob1.isAlive());
            System.out.println("ob2 is alive? " + ob2.isAlive());
            System.out.println("ob3 is alive? " + ob3.isAlive());

            ob1.join();
            ob2.join();
            ob3.join();

            System.out.println("ob1 is alive after join? " + ob1.isAlive());
            System.out.println("ob2 is alive after join? " + ob2.isAlive());
            System.out.println("ob3 is alive after join? " + ob3.isAlive());

        } catch (Exception e){

        }
    }
}
