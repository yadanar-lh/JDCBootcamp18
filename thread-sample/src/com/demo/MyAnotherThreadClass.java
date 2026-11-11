package com.demo;

import java.time.Duration;

public class MyAnotherThreadClass extends MyClass implements Runnable{
    public MyAnotherThreadClass(String name){
        Thread t = new Thread(this,name); //because interface has no constructor,
                                                // build new thead obj to use start()
        t.start();
    }
    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            System.out.println(Thread.currentThread().getName() + "::" + i);
            try {
                Thread.sleep(Duration.ofSeconds(1));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
