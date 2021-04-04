package com.java.interview_questions;

import org.testng.Assert;

import java.util.Scanner;

public class PalindromCheck {
    static int x;
    Scanner scanner = new Scanner(System.in);

    PalindromCheck() {
        System.out.println("Enter Number :");
        x = scanner.nextInt();
    }

    public static void main(String[] args) {
        new PalindromCheck();
//        121 - > 121
        int res = 0;
        int x0 = x;
        while (x != 0) {
            res = res * 10 + (x % 10);
            x = x / 10;
        }
        try {
            Assert.assertEquals(x0, res, "FAIL : Number is not palindrom");
            System.out.println("Number is Palindrom");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Number is not Palindrom");
        }
    }
}
