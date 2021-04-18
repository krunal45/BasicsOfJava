package com.collection.framework;

public class serveCustomer {

    private static boolean isServed;
    private String name;

    public serveCustomer(String name) {
        isServed = false;
        this.name = name;
    }

    public static void serve(String name) {
        isServed = true;
        System.out.println("Served" + name);

    }


    public String toString() {
        return name;
    }
}
