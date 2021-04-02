package com.java.interview_questions;

import java.util.Scanner;

public class FindingLeapYear {
    int Year;
    Scanner scanner = new Scanner(System.in);

    public boolean isLeapYear() {
        boolean flag;
        System.out.println("Enter year to check : ");
        Year = scanner.nextInt();
        flag = Year % 4 == 0;
        return flag;
    }

    public static void main(String[] args) {
        FindingLeapYear fly = new FindingLeapYear();
        System.out.println("IS Leap Year :" + fly.isLeapYear());
    }
}
