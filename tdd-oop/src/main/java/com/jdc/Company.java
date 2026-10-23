package com.jdc;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private Employee[] employees=
            new Employee[4];
    int counter=0;

    public void addEmployee(Employee employee){
        employees[counter++]=employee;
    }
    public int totalSalary(){
        int total=0;
        for(int i=0;i<counter;i++){
            total+=employees[i].calculateSalary();
        }
        return total;
    }
}
