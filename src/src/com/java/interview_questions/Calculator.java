package com.java.interview_questions;

import java.util.Scanner;

public class Calculator {
    static double x1, x2;
    static char operation;
    Scanner scanner = new Scanner(System.in);

    Calculator() {
        System.out.println(" Num1 :");
        x1 = scanner.nextInt();
        System.out.println(" Operation 1.+ 2.- 3.* 4./");
        operation = scanner.next().charAt(0);
        System.out.println(" Num2 :");
        x2 = scanner.nextInt();
    }

    public static void main(String[] args) {
        new Calculator();
        switch (operation) {
            case '+':
                System.out.println(x1 + " + " + x2 + " = " + (x1 + x2));
                break;
            case '-':
                System.out.println(x1 + " - " + x2 + " = " + (x1 - x2));
                break;
            case '*':
                System.out.println(x1 + " * " + x2 + " = " + (x1 * x2));
                break;
            case '/':
                System.out.println(x1 + " / " + x2 + " = " + (x1 / x2));
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
