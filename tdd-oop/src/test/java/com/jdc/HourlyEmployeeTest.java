package com.jdc;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HourlyEmployeeTest {
    private HourlyEmployee hourlyEmployee;
    @BeforeEach
    public void init(){
        hourlyEmployee = new HourlyEmployee("HE001",
                "Thomas","Hardy");
    }
    @Test
    public void should_return_salary_for_hourly_employee(){
        hourlyEmployee.setRate(10);
        hourlyEmployee.setHoursWorked(80);
        assertThat(hourlyEmployee.calculateSalary()
                ,equalTo(800));
    }
    @Test
    public void should_return_charity_for_hourly_employee(){
        assertThat(hourlyEmployee.makeCharity(10),equalTo(10));
    }

    @Test
    public void should_return_50000_for_life_insurance(){
        hourlyEmployee.setiInsurance(new HourlyEmployeeLifeInsurance());
        assertThat(hourlyEmployee.makeLifeInsurance(),equalTo(50000));
    }
}
