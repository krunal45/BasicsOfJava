package com.java.interview_questions;

import java.util.Scanner;

public class ArmstrongNumber {
    //    153=1*1*1 + 5*5*5 + 3*3*3 = 153
    static int x;
    Scanner scanner = new Scanner(System.in);

    ArmstrongNumber() {
        System.out.println("Please Enter a number : ");
        x = scanner.nextInt();
    }

    public static void main(String[] args) {
        new ArmstrongNumber();
        int actualNum = x;
        double res = 0;
        while (actualNum != 0) {
            res = res + Math.pow(actualNum % 10, 3);
            actualNum = actualNum / 10;
        }
        if (res == x) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }
}
