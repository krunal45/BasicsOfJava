package com.java.interview_questions;

import java.util.Scanner;

public class MultiplyFloatingPointNumbers {
    float a = 0, b = 0;
    Scanner scanner = new Scanner(System.in);

    public float multiply() {
        System.out.println("Enter 2 floating point numbers to multiply");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        return (a * b);
    }

    public static void main(String[] args) {
        MultiplyFloatingPointNumbers mul = new MultiplyFloatingPointNumbers();
        System.out.println("Multiplication of 2 numbers :" + mul.multiply());
    }
}
