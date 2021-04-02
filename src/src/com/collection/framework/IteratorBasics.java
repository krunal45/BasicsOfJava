package com.collection.framework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorBasics {

    ArrayList<Integer> intList = new ArrayList<Integer>();
    ArrayList<Integer> oddList = new ArrayList<Integer>();


    public void addInt() {
        for (int i = 0; i < 10; i++) {
            intList.add(i);
        }
    }

    public ArrayList<Integer> getOddNum() {
        Iterator odd = intList.iterator();
        while (odd.hasNext()) {
            int i = (Integer) odd.next();
            if (i % 2 != 0) {
                oddList.add(i);
            }
        }
        return oddList;
    }

    public static void main(String[] args) {
        IteratorBasics ib = new IteratorBasics();
        ib.addInt();
        ib.getOddNum();
        System.out.println("Odd Numbers are :" + ib.oddList);
    }
}
