package com.jdc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    private static Lock lock=new ReentrantLock();
    private static int counter;

    public static void increment(){
        lock.lock();
        counter++;
        lock.unlock();
    }

    public static void first(){
        for(int i=0;i<10000;i++){
            increment();
        }
    }
    public static void second(){
        for(int i=0;i<10000;i++){
            increment();
        }
    }

    static void main() {
        Thread t1=new Thread(() -> first());
        Thread t2=new Thread(()-> second());
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Counter:"+ counter);
    }
}