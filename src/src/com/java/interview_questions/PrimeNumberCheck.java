package com.java.interview_questions;

import java.util.Scanner;

public class PrimeNumberCheck {
    static int x;
    Scanner scanner = new Scanner(System.in);

    PrimeNumberCheck() {
        System.out.println("Enter Number :");
        x = scanner.nextInt();
    }


    public static void main(String[] args) {
        int rem = 1, count = 0;
        new PrimeNumberCheck();
        for (int i = 1; i <= 10; i++) {
            if (x == 1) {
                System.out.println("Number is not prime");
                break;
            }
            rem = x % i;
            if (rem == 0) {
                count++;
            }
        }
        if (count <= 2 && x != 1) {
            System.out.println("Number is Prime");
        } else {
            if (x != 1)
                System.out.println("Number is not prime");
        }
    }
}
