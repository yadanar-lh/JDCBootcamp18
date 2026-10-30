package com.jdc;

import java.time.Duration;

public class CheckedException {
    //ducking //Throws
    public void test1() throws InterruptedException{
        Thread.sleep(Duration.ofSeconds(3));
    }

    public void test2() throws InterruptedException{
        test1();
    }

    public void test3() throws InterruptedException{
        test2();
    }



    //Handling
//    public void test1(){
//        try{
//            Thread.sleep(Duration.ofSeconds(3));
//        } catch (InterruptedException e){
//
//        }
//    }
    void main(){
        try {
            test3();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}
