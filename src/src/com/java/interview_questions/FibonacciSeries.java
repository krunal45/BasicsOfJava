package com.java.interview_questions;

import java.util.Scanner;

public class FibonacciSeries {
    //    0 1 1 2 3
    int x = 0, y = 1, sum, range;
    Scanner scanner = new Scanner(System.in);

    FibonacciSeries() {
        System.out.println("Enter Range for fibonnaci :");
        range = scanner.nextInt();
    }

    public void fibonnaci() {
        int i = 0;
        System.out.print(x + " " + y);
        while (i <= range) {
            sum = x + y;
            System.out.print(" " + (sum));
            x = y;
            y = sum;
            i++;
        }
    }

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.fibonnaci();
    }
}
