package com.jdc;

public class MiddleLayer implements IHelp{
    private static final int MIDDLE_NUMBER = 2;
    private IHelp iHelp;

    public MiddleLayer(IHelp iHelp) {
        this.iHelp = iHelp;
    }


    @Override
    public void help(int num) {
        if(num == MIDDLE_NUMBER){
            System.out.println("This is Middle Layer");
        } else {
            iHelp.help(num);
        }
    }
}
