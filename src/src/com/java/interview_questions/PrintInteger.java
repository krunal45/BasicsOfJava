package com.java.interview_questions;

import java.util.Scanner;

public class PrintInteger {
    int num = 0;
    Scanner scanner = new Scanner(System.in);

    public int getInput() {
        System.out.println("Enter number :");
        num = scanner.nextInt();
        return num;
    }

    public static void main(String[] args) {
        PrintInteger prt = new PrintInteger();
        System.out.println("Number entered by user :" + prt.getInput());
    }
}
