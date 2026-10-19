package com.demo;

public class Employee {

    public int publicInt;
    protected int protectedInt;
    int defaultInt;
    private int privateInt;

    static void main() {

        Employee obj = new Employee();

        System.out.println(obj.getClass().getSigners());
    }
}
