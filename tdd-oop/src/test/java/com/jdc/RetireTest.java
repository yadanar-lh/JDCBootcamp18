package com.jdc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class RetireTest {

    private Retire retire;
    @BeforeEach
    public void init(){
        retire = new Retire("John","Doe");
    }
    @Test
    public void should_return_150_for_pension_plan(){
        retire.setPensionManager(new PensionManager());
        assertThat(retire.makePension(150),equalTo(150));
    }
    @Test
    public void should_return_200_when_more_than_200_for_pension_plan(){
        retire.setPensionManager(new PensionManager());
        assertThat(retire.makePension(300),equalTo(200));
    }

    @Test
    public void should_return_70000_for_life_insurance(){
        retire.setiInsurance(new RetireLifeInsurance());
        assertThat(retire.makeLifeInsurance(),equalTo(70000));
    }
}