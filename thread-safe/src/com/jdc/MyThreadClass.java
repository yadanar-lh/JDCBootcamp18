package com.jdc;
public class MyThreadClass extends Thread{
    private String str1;
    private String str2;
    private TwoStringClass twoStringClass;
    public MyThreadClass(String str1, String str2,
                         TwoStringClass twoStringClass) {
        this.str1 = str1;
        this.str2 = str2;
        this.twoStringClass=twoStringClass;
        start();
    }

    @Override
    public void run() {
        synchronized (twoStringClass){
            twoStringClass.printTwoString(str1,str2);
        }

    }
}
