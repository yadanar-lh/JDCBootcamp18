package com.jdc;

public class SalaryEmployee extends Employee{
    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public SalaryEmployee(String employeeId,
                          String firstName,
                          String lastName
                          ) {
        super(employeeId, firstName, lastName);

    }

    public int calculateSalary() {
        return salary;
    }


    private PensionManager pensionManager;

    public void setPensionManager(PensionManager pensionManager) {
        this.pensionManager = pensionManager;
    }

    public int makePension(int amount){
        return pensionManager.makePension(amount);
    }
}
