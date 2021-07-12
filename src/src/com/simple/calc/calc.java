package com.simple.calc;

import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first numeric value :");
        String s1 = scanner.nextLine();
        System.out.println("Enter second numeric value :");
        String s2 = scanner.nextLine();
        double res = Double.sum(Double.parseDouble(s1), Double.parseDouble(s2));
        System.out.println(res);
    }
}
