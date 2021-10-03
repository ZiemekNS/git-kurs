package com.example.threads;

class RunnableClass implements Runnable {
    private int sleepTime;
    private String threadName;

    public RunnableClass(int sleepTime, String threadName) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Wątek, wartość i: " + i);
            try {
                Thread.sleep(this.sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {

        RunnableClass t1 = new RunnableClass(500, "thread1");
        Thread thread1 = new Thread(t1, "thread1");
        thread1.start();

        RunnableClass t2 = new RunnableClass(1000, "thread2");
        Thread thread2 = new Thread(t2, "thread2");
        thread2.start();

    }
}
