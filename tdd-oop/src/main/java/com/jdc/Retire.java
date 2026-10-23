package com.jdc;

public class Retire {
    private String firstName;
    private String lastName;
    private PensionManager pensionManager;
    private IInsurance iInsurance;

    public void setiInsurance(IInsurance iInsurance) {
        this.iInsurance = iInsurance;
    }

    public void setPensionManager(PensionManager pensionManager) {
        this.pensionManager = pensionManager;
    }

    public Retire(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int makePension(int amount){
        return pensionManager.makePension(amount);
    }

    public int makeLifeInsurance(){
        return iInsurance.makeLifeInsurance(); //dedicate
    }
}
