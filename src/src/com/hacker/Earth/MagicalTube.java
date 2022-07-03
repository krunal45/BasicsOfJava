package com.basics.hackerEarth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicalTube {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int Q = 0;
        int X = 0;
        int N = 0;
        List<Integer> actualList;
        List<Integer> outputList = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            actualList = new ArrayList<>();
            Q = scanner.nextInt();
            for (int j = 0; j < Q; j++) {
                X = scanner.nextInt();
                N = scanner.nextInt();

                if (X == 1) {
                    actualList.add(j, N);
                } else if (X == 2) {
                    if (j != 0) {
                        actualList.add(j, N);
                        outputList.add(actualList.get(j - 1));
                    }
                }
            }

        }
        for (int k : outputList) {
            System.out.print(k + " ");
        }
    }
}
