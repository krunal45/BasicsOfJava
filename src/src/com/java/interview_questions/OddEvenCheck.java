package com.java.interview_questions;

import java.util.Scanner;

public class OddEvenCheck {
    int a;
    Scanner scanner = new Scanner(System.in);

    public String oddEvenCheck() {
        System.out.println("Please Enter number :");
        a = scanner.nextInt();
        String value = (a % 2 == 0) ? "Even" : "Odd";
        return value;
    }

    public static void main(String args[]) {
        OddEvenCheck oec = new OddEvenCheck();
        System.out.println("Number is " + oec.oddEvenCheck());
    }
}
