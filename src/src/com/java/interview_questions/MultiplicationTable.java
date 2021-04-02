package com.java.interview_questions;

import java.util.Scanner;

public class MultiplicationTable {
    static int x, res = 1;
    Scanner scanner = new Scanner(System.in);

    MultiplicationTable() {
        System.out.print("Enter Number :");
        x = scanner.nextInt();
    }

    public void printTable() {
        for (int i = 1; i <= 10; i++) {
            res = x * i;
            System.out.println(x + " X " + i + " = " + res);
        }
    }

    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.printTable();
    }
}
