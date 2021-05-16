package com.threads.example;

public class ThreadExample extends Thread {

    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        ThreadExample t1 = new ThreadExample();
        t1.setName("My first thread");
        A a1 = new A();
        a1.setName("My first thread");
        a1.start();

        A a2 = new A();
        a2.setName("My second thread");
        a2.start();



    }

}

class A extends ThreadExample {
    @Override
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println(i + " " + this.getName());
            i++;
        }
    }
}


