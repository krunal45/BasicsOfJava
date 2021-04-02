package com.java.interview_questions;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 1, b = 2;
//        Without using temporary variables
        System.out.println("Before swapping : a=" + a + " & b = " + b);
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("After swapping : a=" + a + " & b =" + b);
    }


}
