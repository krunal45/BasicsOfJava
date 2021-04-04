package com.java.interview_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RangeOfPrimeNumbers {
    static int num1, num2;
    Scanner scanner = new Scanner(System.in);

    RangeOfPrimeNumbers() {
        System.out.println("Enter lower & upper range :");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        if (num2 < num1) {
            System.out.println("Upper Range cannot be lower than lower Range");
            new RangeOfPrimeNumbers();
        }
    }

    public static void main(String[] args) {
        int rem = 1, count = 0;
        new RangeOfPrimeNumbers();
        List<Integer> primeNum = new ArrayList<Integer>();

        for (int j = num1; j <= num2; j++) {
            for (int i = 1; i <= num2; i++) {
                rem = j % i;
                if (rem == 0) {
                    count++;
                }
            }
            if (count == 2 && j != 1) {
                primeNum.add(j);
            }
            count = 0;
        }
        System.out.println("Prime Numbers between " + num1 + " & " + num2 + " are " + primeNum);
    }
}
