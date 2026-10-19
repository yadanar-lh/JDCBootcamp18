package com.demo.jdc;

import com.demo.Employee;

public class ContractEmployee extends Employee {
    public void doSomething(){
        publicInt = 1;
        protectedInt = 1;
        //defaultInt = 1; not in same package
        //privateInt = 1;
    }
}
