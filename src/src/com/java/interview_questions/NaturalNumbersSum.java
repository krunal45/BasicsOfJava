package com.java.interview_questions;

import java.util.Scanner;

public class NaturalNumbersSum {
    int num1, num2, sum;
    Scanner scanner = new Scanner(System.in);

    NaturalNumbersSum() {
        System.out.print("Enter Range of 2 numbers for which sum is needed");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
    }

    public int getSum() {
        int i = num1;
        do {
            sum = sum + i;
            i++;
        } while (i <= num2);
        return sum;
    }

    public static void main(String[] args) {
        NaturalNumbersSum nns = new NaturalNumbersSum();
        System.out.print("Sum is : " + nns.getSum());
    }
}
