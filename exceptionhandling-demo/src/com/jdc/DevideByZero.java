package com.jdc;

public class DevideByZero {
    static void main() {
        try {
            System.out.println(4/0);
        } catch (ArithmeticException e){
            e.printStackTrace(); //show error and still continuing program
        }

        System.out.println("Print Me");
    }
}
