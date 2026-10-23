package com.jdc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class CompanyTest {
    private Company company;

    @BeforeEach
    public void init(){
        company=new Company();
    }
    @Test //  1000 + 300 + 2500 + 1000 = 4800
    public void should_return_sum_for_total_salary(){
        HourlyEmployee h1=
                new HourlyEmployee("H1","John","Doe");
        h1.setRate(10);
        h1.setHoursWorked(100);

        HourlyEmployee h2=
                new HourlyEmployee("H2","John","William");
        h2.setRate(15);
        h2.setHoursWorked(20);

        SalaryEmployee s1=new SalaryEmployee("S1","Mary","Shelly");
        s1.setSalary(2500);

        SalaryEmployee s2=new SalaryEmployee("S2",
                "Charles","Dickens");
        s2.setSalary(1000);

        company.addEmployee(h1);
        company.addEmployee(h2);
        company.addEmployee(s1);
        company.addEmployee(s2);
        assertThat(company.totalSalary(),equalTo(4800));
    }
}
