package com.jdc;
/*
Why Package is needed
=====================
1. Eliminate name conflict
2. The related class to collect


Access Modifier
==============

private
default
protected
public

POJO - Plain Old Java Object
Class
Field
variables - private
create getter, setter
-encapsulation
 */

public class Employee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary/30;
    }

    //declaration
    public void setSalary(int salary) {
        if(salary < 0){
            System.out.println("Salary is negative");
//            return;
        }
        this.salary = salary;
    }

    private String name;
    private int salary;
    //properties, fields,state,variable,attribute
    //behavior, method

    //Both are members of a class

    //Constructor must be same name with class

//    public Employee(){
//
//    }


}
