package com.jdc;

public class Main {
    static void main() {
        CubbyHole cubbyHole = new CubbyHole();
        Producer producer = new Producer(cubbyHole,1);
        Consumer consumer = new Consumer(cubbyHole,1);
    }
}
