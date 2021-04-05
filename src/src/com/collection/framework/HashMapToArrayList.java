package com.collection.framework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapToArrayList {

    public static void main(String[] args) {
        HashMap<String, Integer> comp = new HashMap<>();
        comp.put("Amazon", 1000);
        comp.put("Bata", 2000);

        Iterator iter = comp.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry map = (Map.Entry) iter.next();
            System.out.println(map.getKey() + " = " + map.getValue());
        }
    }
}
