package com.jdc;

public class Main {
    static void main() {
        Circle circle = new Circle();
        Square square = new Square();

        /*
        1. test both classes in the same inheritance
        2. Parent class must be on left

        pass is-a test

         */
        Shape triangle = new Triangle();
        triangle.draw();
        test(triangle);
    }

    public static void test(Shape s){
        System.out.println("Shape");
    }

    public static void test(Triangle t){
        System.out.println("Triangle");
    }

}
