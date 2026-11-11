package com.jdc;

public class Consumer extends Thread{
    private CubbyHole cubbyHole;
    private int number;

    public Consumer(CubbyHole cubbyHole, int number) {
        this.cubbyHole = cubbyHole;
        this.number = number;
        start();
    }

    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            cubbyHole.get(number);
        }
    }
}
