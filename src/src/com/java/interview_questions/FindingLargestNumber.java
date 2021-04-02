package com.java.interview_questions;

import java.util.Scanner;

public class FindingLargestNumber {
    int a, b, c, max;
    Scanner scanner = new Scanner(System.in);

    public int findMax() {
        System.out.println("Enter 3 numbers :");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a > b) {
            max = Math.max(a, c);
        } else {
            max = Math.max(b, c);
        }
        return max;
    }

    public static void main(String[] args) {
        FindingLargestNumber fln = new FindingLargestNumber();
        System.out.println("Largest number is " + fln.findMax());
    }
}
