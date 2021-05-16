package com.threads.example;

public class SyncronisedThreadExample {

    static int balance;

    public SyncronisedThreadExample(int balance) {
        SyncronisedThreadExample.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized static void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " Withdrawn Success. Remaining Balance is " + balance);
        } else {
            System.out.println(" Transaction Denied ! Insufficient balance");
        }

    }
}

class A1 {
    public static void main(String[] args) {

        new SyncronisedThreadExample(100);
        Thread t1 = new Thread(() -> SyncronisedThreadExample.withdraw(100));
        Thread t2 = new Thread(() -> SyncronisedThreadExample.withdraw(100));
        t1.start();
        t2.start();
    }
}

