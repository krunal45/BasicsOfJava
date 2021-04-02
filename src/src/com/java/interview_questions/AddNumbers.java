package com.java.interview_questions;

import java.util.Scanner;

public class AddNumbers {
    int a = 0, b = 0;
    Scanner scanner = new Scanner(System.in);

    public int sum() {
        System.out.print("Enter 2 Numbers to add : -");
        a = scanner.nextInt();
        b = scanner.nextInt();
        return a + b;
    }

    public static void main(String[] args) {
        AddNumbers an = new AddNumbers();
        System.out.println("Sum is " + an.sum());
    }
}
