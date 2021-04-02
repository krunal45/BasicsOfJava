package com.java.interview_questions;

public class StringArrayExample {

    StringArrayExample() {
        String name = "Krunal";
        String name1 = new String("Krunal");
        name1 = name1.substring(2);
        name1 = name1.substring(0, 2);
    }

    public static void main(String[] args) {
        StringArrayExample sae = new StringArrayExample();
        args = new String[]{"Krunal"};
        System.out.print("Your first argument is :" + args);
    }

}
