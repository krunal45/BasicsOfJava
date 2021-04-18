package com.collection.framework;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
//        Order is not fixed.
        phoneBook.put("Adam", 12345);
        phoneBook.put("Bob", 321654);
        phoneBook.put("Cem", 123456);
        System.out.println(phoneBook);
        if (phoneBook.containsKey("Adam"))
            phoneBook.remove("Adam");
        System.out.println(phoneBook);
        phoneBook.clear();
        System.out.println(phoneBook);
    }
}
