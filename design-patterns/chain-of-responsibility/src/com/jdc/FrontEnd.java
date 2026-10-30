package com.jdc;

public class FrontEnd implements IHelp{

    private static final int FRONT_END_NUMBER = 3;
    private IHelp iHelp;

    public FrontEnd(IHelp iHelp) {
        this.iHelp = iHelp;
    }

    @Override
    public void help(int num) {
        if(num == FRONT_END_NUMBER){
            System.out.println("This is front end.");
        } else {
            iHelp.help(num);
        }
    }
}
