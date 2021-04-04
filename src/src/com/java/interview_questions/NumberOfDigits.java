package com.java.interview_questions;

import java.util.Scanner;

public class NumberOfDigits {
    static short x;
    Scanner scanner = new Scanner(System.in);

    NumberOfDigits() {
        System.out.println("Enter number :");
        x = scanner.nextShort();
    }

    public static void main(String[] args) {
        new NumberOfDigits();
        System.out.println("Length of Number Entered :" + Integer.toString(x).length());
    }
}
