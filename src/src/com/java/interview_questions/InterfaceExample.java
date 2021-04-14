package com.java.interview_questions;

import java.util.ArrayList;
import java.util.List;


public interface InterfaceExample {

    //There would be no constructor of interface
//    For Ex : This is calculator interface
    void add(int x, int y);

//    void sub(int x, int y);


//    void add();
}

class calc implements InterfaceExample {

    public static void main(String[] args) {

        InterfaceExample ie = (x, y) -> System.out.println("Addition is :" + (x + y));
        ie.add(5, 8);
        List<String> names = new ArrayList<String>();
        names.add(0, "bob");
        names.add("ahan");
//        for (String name : names) {
//            System.out.println(name);
//        }
        //            System.out.println(name);
        //        }
//        names.forEach(System.out::println);
        names.forEach(calc::printName);


    }

    static void printName(String name) {
        System.out.println(name);
    }


    @Override
    public void add(int x, int y) {

    }


}
