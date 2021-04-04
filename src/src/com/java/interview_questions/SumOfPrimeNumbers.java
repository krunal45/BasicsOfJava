package com.java.interview_questions;

import java.util.ArrayList;
import java.util.List;

public class SumOfPrimeNumbers {
    //    11 - > 1,3,5,7,11
    static int x = 13;

    public static void main(String[] args) {
        int count = 0, rem = 0, res = 0;
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i < x; i++) {
            for (int j = 1; j <= 10; j++) {
                rem = i % j;
                if (rem == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                lst.add(i);
            }
            count = 0;
        }
        System.out.println("List of Prime Numbers :" + lst);

        for (int s = 0; s <= lst.size() - 1; s++) {

            for (int t = 1; t <= lst.size() - 1; t++) {
                if (s != t)
                    res = lst.get(s) + lst.get(t);
            }
            if (res == x) {
                System.out.println("Sum of 2 Prime Numbers is equal to " + x);
                break;
            }
        }
        if (res != x)
            System.out.println("Sum of 2 Prime numbers is not equal to " + x);

    }
}




