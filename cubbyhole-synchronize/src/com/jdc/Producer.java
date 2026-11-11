package com.jdc;

import java.time.Duration;

public class Producer extends Thread{
    private CubbyHole cubbyHole;
    private int number;

    public Producer(CubbyHole cubbyHole, int number) {
        this.cubbyHole = cubbyHole;
        this.number = number;
        start();
    }

    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            cubbyHole.put(number,i);
            try{
                sleep(Duration.ofSeconds(2));
            } catch (InterruptedException e){

            }
        }
    }
}
