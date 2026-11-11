package com.demo;

import java.time.Duration;

public class MyThreadClass extends Thread{
    public MyThreadClass(String name){
        super(name);
        this.start();
    }

    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            System.out.println(getName() + "::" + i);
            try {
                sleep(Duration.ofSeconds(1));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
