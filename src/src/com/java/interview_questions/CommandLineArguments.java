package com.java.interview_questions;

import java.lang.invoke.LambdaConversionException;
import java.util.ArrayList;
import java.util.List;

public class CommandLineArguments {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.forEach(i->System.out.println(i));
}
}
