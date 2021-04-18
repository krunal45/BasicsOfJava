package com.java.interview_questions;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

    static Character[] charArray = {'K', 'B'};
    static Integer[] intArray = {1, 2, 3};
    static String[] stringArray = {"KB"};

    public static <T> List<T> arrayToList(T[] obj, List<T> list) {
        for (T o : obj) {
            list.add(o);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        List<String> strList = arrayToList(stringArray, new ArrayList<>());
        charList.forEach(System.out::println);
        intList.forEach(System.out::println);
        strList.forEach(System.out::println);
    }
}
