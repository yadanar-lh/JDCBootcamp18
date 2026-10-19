package com.demo;

public class MyFunction {
    /*
    access modifier + modifier(optional) + return type + method name ()//method signature + {}

    int add(int num1,int num2){ //default access modifier

    }

    in static method, calculations which are not related to obj can be done.
    if instance object must be called millions times, static method should be used.
     */

    //method declaration
    public static int add(int num1,int num2){ //default access modifier
        return num1 + num2;
    }

    public static void multiply(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public String greet(String name){
        return "Hello! " + name + "!";
    }

    public void saySomething(String input){
        System.out.println(input);
    }

    static void main() {

        MyFunction myFunction = new MyFunction();
        String output = myFunction.greet("Yadanar");
        System.out.println(output);

        myFunction.saySomething("Today is a good day 🎉");

 //       int result = add(5,7); //method invoke
//        MyFunction.add(1,2);
//        System.out.println(result);
//
//        multiply(5,7);
//
//        char letter = "Hello".charAt(4);
//        System.out.println(letter);
    }
}
