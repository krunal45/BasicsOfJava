package com.java.interview_questions;

import java.util.Scanner;

public class Factorial {
    static int x, res = 1;
    Scanner scanner = new Scanner(System.in);

    Factorial() {
        System.out.print("Enter number :");
        x = scanner.nextInt();
    }

    public int getFactorial() {
        while (x >= 1) {
            res = x * res;
            x--;
        }
        return res;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.print("Factorial of " + x + " is " + factorial.getFactorial());
    }
}
