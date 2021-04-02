package com.java.interview_questions;

import java.util.Scanner;

public class VowelConsonentCheck {
    char vowelOrConsonent;
    Scanner scanner = new Scanner(System.in);

    public String vowelConsonentCheck() {
        System.out.println("Enter Character :");
        vowelOrConsonent = scanner.next().charAt(0);
        if (vowelOrConsonent == 'a' || vowelOrConsonent == 'e' || vowelOrConsonent == 'i' || vowelOrConsonent == 'o' || vowelOrConsonent == 'u') {
            return "vowel";
        } else {
            return "consonent";
        }
    }

    public static void main(String[] args) {
        VowelConsonentCheck vc = new VowelConsonentCheck();
        System.out.println("Character is : " + vc.vowelConsonentCheck());
    }
}
