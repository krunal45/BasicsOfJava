package com.collection.framework;

import java.util.LinkedList;

public class LinkedlistqueueExample {


    public static void main(String[] args) {
        LinkedList<serveCustomer> customers = new LinkedList();
        serveCustomer name1 = new serveCustomer("Adam");
        serveCustomer name2 = new serveCustomer("Bob");
        customers.add(name1);
        customers.add(name2);
        System.out.println(customers);
        servCustomers(customers);
        System.out.println(customers);
    }

    public static void servCustomers(LinkedList<serveCustomer> customers) {
        serveCustomer s = customers.poll();
        s.serve(s.toString());
    }
}

