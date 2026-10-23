package com.jdc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class SalaryEmployeeTest {
    private SalaryEmployee salaryEmployee;

    @BeforeEach
    public void init(){
        salaryEmployee=new SalaryEmployee("MD001",
                "John","Doe");
    }
    @Test
    public void should_return_salary_for_salary_employee(){
        salaryEmployee.setSalary(3000);
        assertThat(salaryEmployee.calculateSalary()
                ,equalTo(3000));
    }
    @Test
    public void should_return_make_charity_for_salary_employee(){
        assertThat(salaryEmployee.makeCharity(20),equalTo(20));
    }

    @Test
    public void should_return_150_for_pension_plan(){
        salaryEmployee.setPensionManager(new PensionManager());
        assertThat(salaryEmployee.makePension(150),equalTo(150));
    }
    @Test
    public void should_return_200_when_more_than_200_for_pension_plan(){
        salaryEmployee.setPensionManager(new PensionManager());
        assertThat(salaryEmployee.makePension(300),equalTo(200));
    }

    @Test
    public void should_return_100000_for_life_insurance(){
        salaryEmployee.setiInsurance(new SalaryEmployeeLifeInsurance());
        assertThat(salaryEmployee.makeLifeInsurance(),equalTo(100000));
    }

}
