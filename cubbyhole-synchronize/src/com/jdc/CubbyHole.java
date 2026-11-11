package com.jdc;

public class CubbyHole {
    private int contents;
    private boolean available = false;

    public synchronized int get(int num){
        while(available == false){
            try {
               wait();
            } catch (Exception e){
                System.out.println(e);
            }
        }
        available = false;
        System.out.println("Consumer %d got %d".formatted(num,contents));
        notifyAll(); //awake all threads in waiting
        return contents;
    }

    public synchronized void put(int who, int value){
        while(available == true){
            try {
                wait();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        contents = value;
        available = true;
        System.out.println("Producer %d put: %d".formatted(who,contents));
        notifyAll();
    }

}
