package com.gb.jobint.lesson3.counter;

public class MainApp {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(5);
                    counter.increment(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread decrementThread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(5);
                    counter.decrement(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        incrementThread.start();
        decrementThread.start();

        try {
            incrementThread.join();
            decrementThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getValue());
    }
}
