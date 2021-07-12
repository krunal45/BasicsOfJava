package com.hacker.Earth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class switchBulbs {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> keys = new ArrayList<>();
        List<String> states = new ArrayList<>();
        int T = s.nextInt();
        int K = 0;
        String state = "";
        for (int a = 0; a < T; a++) {
            K = s.nextInt();
            keys.add(K);
            state = s.next();
            states.add(state);
        }

        for (int test = 0; test < T; test++) {
            String[] stateArray = states.get(test).split("");

            for (int i = 0; i < keys.get(test); i++) {
                String[] newStateArray = new String[stateArray.length];
                for (int k = 0; k < stateArray.length; k++) {
                    if (k == 0) {
                        if (stateArray[k].equals("O")) {
                            newStateArray[k] = "X";
                        } else if (stateArray[k].equals("X")) {
                            newStateArray[k] = "O";
                        }
                    }
                    if (k != 0) {
                        if (newStateArray[k - 1].equals("X") && stateArray[k - 1].equals("O")) {
                            if (stateArray[k].equals("X")) {
                                newStateArray[k] = "O";
                            }
                            if (stateArray[k].equals("O")) {
                                newStateArray[k] = "X";
                            }
                        } else if (newStateArray[k - 1].equals("O") && stateArray[k - 1].equals("X")) {
                            newStateArray[k] = stateArray[k];
                        } else {
                            newStateArray[k] = stateArray[k];
                        }
                    }
                }
                for (String value : newStateArray) {
                    System.out.print(value);
                }
                System.out.println();
                stateArray = newStateArray;
            }
        }
    }
}
