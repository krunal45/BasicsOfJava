package com.hacker.Earth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicalTube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        int X;
        int N;
        List<Integer> list = new ArrayList<>();
        List<Integer> outputList = new ArrayList<>();


        for (int i = 0; i < Q; i++) {
            X = scanner.nextInt();
            N = scanner.nextInt();
            if (X == 1) {
                list.add(i, N);
            } else if (X == 2) {
                list.add(i, N);
                outputList.add((list.get(i - 1)));
            }
        }
        for (int i : outputList) {
            System.out.print(i + " ");
        }
    }
}
