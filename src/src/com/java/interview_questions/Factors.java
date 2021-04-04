package com.java.interview_questions;

import java.util.*;

public class Factors {
    //    10 - > 1 2 5 10
    static int x;
    Scanner scanner = new Scanner(System.in);

    Factors() {
        System.out.println("Enter Number :");
        x = scanner.nextInt();
    }

    public static void main(String[] args) {
        int res = 1, quo = 1;
        List<Integer> lstfct = new ArrayList<>();
        new Factors();
        for (int i = 1; i <= x; i++) {
            res = x % i;
            if (res == 0) {
                quo = x / i;
                lstfct.add(quo);
            }
            Collections.sort(lstfct);
        }
        System.out.println("Factors for " + x + " is " + lstfct);
    }
}
