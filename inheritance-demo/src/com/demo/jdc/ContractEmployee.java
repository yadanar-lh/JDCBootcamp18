package com.demo.jdc;

import com.demo.Employee;

public class ContractEmployee extends Employee {
    public void doSomething(){
        publicInt = 1;
        protectedInt = 1;
        //defaultInt = 1; not in same package
        //privateInt = 1;

        Employee employee = new Employee();
        //employee.protectedInt = 12; error

        ContractEmployee c = new ContractEmployee();
        c.protectedInt = 1; //only use inherited variable in child object
        // so other classes cannot access this variable.
    }
}
