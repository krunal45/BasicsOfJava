package com.string.Examples;

import java.util.Scanner;

public class StringBuilderExample {

    public static void main(String args[]) {
        StringBuilder b = new StringBuilder();

        System.out.println("Enter First Value :");
        Scanner s1 = new Scanner(System.in);
        String fname = s1.next();
        b.append(fname + ", ");
        Scanner s2 = new Scanner(System.in);
        String lname = s2.next();
        b.append(lname);

        System.out.println(b);


    }
}
