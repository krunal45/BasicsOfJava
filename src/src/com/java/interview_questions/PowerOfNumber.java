package com.java.interview_questions;

import java.util.Scanner;

public class PowerOfNumber {
    static int base, power;
    Scanner scanner = new Scanner(System.in);

    PowerOfNumber() {
        System.out.println("Please Enter base & Power :");
        base = scanner.nextInt();
        power = scanner.nextInt();
    }

    public static void main(String[] args) {
        int res = 1;
        new PowerOfNumber();
        if (power != 0) {
            for (int i = 1; i <= power; i++) {
                res *= base;
            }
        }
//        System.out.println(base + " ^ " + power + " = " + res);
        System.out.println(Math.pow(base, power));
    }
}
