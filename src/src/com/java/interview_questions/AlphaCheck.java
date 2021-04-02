package com.java.interview_questions;

import java.util.Scanner;

public class AlphaCheck {
    static char x;
    Scanner scanner = new Scanner(System.in);


    AlphaCheck() {
        System.out.print("Enter Character :");
        x = scanner.next().charAt(0);
    }

    public boolean isAlphabet() {
        return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z');
    }

    public static void main(String[] args) {
        AlphaCheck ac = new AlphaCheck();
        System.out.print(x + " is Alphabet :" + ac.isAlphabet());
    }
}
