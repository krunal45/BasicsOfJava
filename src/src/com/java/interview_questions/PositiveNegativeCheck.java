package com.java.interview_questions;

import java.util.Scanner;

public class PositiveNegativeCheck {
    static double j;
    Scanner scanner = new Scanner(System.in);

    PositiveNegativeCheck() {
        System.out.println("Enter Number :");
        j = scanner.nextInt();
    }

    String positiveNegativeCheck() {
        if (j == 0) {
            return "zero";
        }
        return (j < 0) ? "Negative" : "Positive";
    }

    public static void main(String[] args) {
        PositiveNegativeCheck pnc = new PositiveNegativeCheck();
        System.out.print(j + " is " + pnc.positiveNegativeCheck());
    }


}
