package com.hacker.Earth;

import java.util.Scanner;

public class PrecisionCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        float R1 = ((float) N / (float) D);
        String r1;
        r1 = String.format("%.2f", R1);
        R1 = Float.parseFloat(r1);
        String s = String.valueOf(R1);
        String[] s1;
        s = s.substring(2);
        s1 = s.split("");
        float r2 = N / D;
        String sr2 = String.valueOf((int) r2);
        int rem = N % D;

            if (rem != 0) {
                if (s1[0].equals(s1[ 1])) {
                    System.out.print((sr2 + "(.)" + s1[0]));
                } else {
                    System.out.print(r1);
                }
            } else {
                System.out.printf("%d", (int) r2);
            }
        }

    }

