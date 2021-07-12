package com.string.Examples;

public class StringMethodExamples {

    public static void main(String[] args) {
        String s1 = "Welcome to India!";
        int len = s1.length();
        System.out.println(len);

        String subString = s1.substring(11);
        System.out.println(subString);
        System.out.println(s1.indexOf("India"));

        String s3 = "  Welcome   !   ";
        String trimmed = s3.trim();
        System.out.println(trimmed);

        String s4 = "007";
        int i = Integer.parseInt(s4);
        System.out.println(i);
    }
}
