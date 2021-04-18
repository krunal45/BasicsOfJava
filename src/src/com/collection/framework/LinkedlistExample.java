package com.collection.framework;

import java.util.LinkedList;
//Linked List holds info about previous & post element of list & hence consumes more memory than Arraylist

public class LinkedlistExample {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("A");
        names.add("C");
        names.add(1, "B");
        names.forEach(System.out::println);
        names.remove("C");
        names.forEach(System.out::println);
    }
}
