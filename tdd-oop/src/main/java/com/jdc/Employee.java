package com.jdc;

public abstract class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private IInsurance iInsurance;

    public void setiInsurance(IInsurance iInsurance) {
        this.iInsurance = iInsurance;
    }

    public int makeLifeInsurance(){
        return iInsurance.makeLifeInsurance();
    }

    public int makeCharity(int amount){
        return amount;
    }

    public abstract int calculateSalary();

    public Employee(String employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
