package com.threads.example;

public class ThreadDeadlockExample extends Thread {

    static Object spoon = new Object();
    static Object bowl = new Object();

    public static void main(String[] args) {

//        Object spoon = new Object();
//        Object bowl = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (spoon) {
                System.out.println("Got Spoon waiting for bowl");
            }
            synchronized (bowl) {
                System.out.println("Holding both spoon & bowl");
            }

        });

        Thread t2 = new Thread(() -> {
            synchronized (spoon) {
                System.out.println("Got bowl waiting for spoon");
            }

            synchronized (bowl) {
                System.out.println("Holding both spoon & bowl");
            }
        });

        t1.start();
        t2.start();


    }
}
