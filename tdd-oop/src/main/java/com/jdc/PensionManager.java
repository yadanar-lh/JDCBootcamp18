package com.jdc;

public class PensionManager {

    public int makePension(int amount){
        return amount >= 200 ? 200 : amount;
    }
}
