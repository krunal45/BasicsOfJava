package com.java.interview_questions;

public class varArgsExample {

    public static void printFruits(String... fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        ;
    }

    public static void main(String[] args) {
        varArgsExample.printFruits("Apple", "Banana", "Chickoo");
    }
}
