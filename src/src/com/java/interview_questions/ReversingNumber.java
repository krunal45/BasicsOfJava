package com.java.interview_questions;

import java.util.Scanner;

public class ReversingNumber {
    static int x;
    Scanner scanner = new Scanner(System.in);

    ReversingNumber() {
        System.out.println("Enter Number :");
        x = scanner.nextInt();
    }


    public static void main(String[] args) {
        new ReversingNumber();
//        Method 1
//        char[] c = Integer.toString(x).toCharArray();
//        int len = c.length;
//        for (int i = len - 1; i >= 0; i--) {
//            System.out.print(c[i]);
//        }
//        Method 2
        int rev = 0;
//        1234 -- -> 4321
        while (x != 0) {
            rev = rev * 10 + (x % 10);
            x = x / 10;
        }
        System.out.println("Reversed number : " + rev);
    }
}
