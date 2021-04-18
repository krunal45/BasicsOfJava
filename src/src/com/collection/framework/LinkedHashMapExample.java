package com.collection.framework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>(4, 0.75f, true);
        phoneBook.put("Adam", 12345);
        phoneBook.put("Eve", 45678);
        phoneBook.put("George", 54678);
        System.out.println("Adam Contact :" + phoneBook.get("Adam"));

        for (Map.Entry<String, Integer> phoneNo : phoneBook.entrySet()) {
            System.out.println(phoneNo.getKey() + " : " + phoneNo.getValue());
        }
    }
}
