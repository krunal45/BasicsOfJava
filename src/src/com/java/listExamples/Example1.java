package com.java.listExamples;

import java.util.ArrayList;
import java.util.List;

public class Example1 {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i, i);
        }
    }
}
