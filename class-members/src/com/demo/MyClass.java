package com.demo;

public class MyClass {
    /*
    state, behavior

    instance variable
    static variable
    local variable must be initialized, no default value;
     */

    private String name; //instance variable, without object, this variable cannot be used.
    static int count;// static variable // share all the values in one variable, even if obj is called, it only shows its value, not obj var
    //not copy from objects, only one variable with so many obj
    MyClass(){
        count++;
    }

    public static void greeting(int num1){
        System.out.println(num1);//num1 is local variable //no initialization is needed but cannot be used outside of scope.
        //name = "John William"; //error,no virtual object , this cannot be used in static method.
        //System.out.println(this); //error
        MyClass myClass = new MyClass(); //actual object
        myClass.name = "John William";
        System.out.println("Hello World");
    }

    public void doSomething(){
        System.out.println(this);
        this.name = "Yadanar"; //this means virtual object becuz variable need objects to call.
        String greet; //local variable must be initialized. Only access modifier is final;
    }

    static void main() {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        System.out.println(obj1.count);
        System.out.println(count);
    }

    //Garbage collector 4 ways to delete
    //if obj  are unable to delete, memory leak happens

}
