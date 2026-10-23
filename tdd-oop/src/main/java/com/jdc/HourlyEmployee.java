package com.jdc;

public class HourlyEmployee extends Employee {
    private int rate;
    private int hoursWorked;

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public HourlyEmployee(String employeeId, String firstName, String lastName) {
        super(employeeId, firstName, lastName);
    }
    public int calculateSalary() {
        return rate * hoursWorked;
    }
}
