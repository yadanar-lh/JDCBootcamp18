package com.demo;

import java.util.Scanner;

/*
God Class

Composition, Generalization
has a , is a (Inheritance)

A Cat is an Animal.
every

Cat -- child/SubClass / Animal -- Parent/SuperClass
class Cat extends Animal{

}
 */

public class Calculator {
    private int num1;
    private int num2;

    public int add(){
        return num1 + num2;
    }

    public int subtract(){
        return num1 - num2;
    }

    public int multiply(){
        return num1 * num2;
    }

    public int divide(){
        return num1/num2;
    }

    static void main() {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Operator(+,-,*,/) : ");
        String operator = sc.nextLine();

        System.out.print("Enter Number 1 : ");
        c.num1 = sc.nextInt();

        System.out.print("Enter Number 2 : ");
        c.num2 = sc.nextInt();

        if(operator.equals("+")){
            System.out.println("%d + %d is %d".formatted(c.num1,c.num2,c.add()));
        } else if(operator.equals("-")){
            System.out.println("%d - %d is %d".formatted(c.num1,c.num2,c.subtract()));
        } else if(operator.equals("*")){
            System.out.println("%d * %d is %d".formatted(c.num1,c.num2,c.multiply()));
        } else if(operator.equals("/")){
            System.out.println("%d / %d is %d".formatted(c.num1,c.num2,c.divide()));
        } else {
            System.out.println("Invalid Operator!");
        }

        sc.close();
    }
}
