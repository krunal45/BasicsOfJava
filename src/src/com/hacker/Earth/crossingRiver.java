package com.hacker.Earth;/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.util.*;


class crossingRiver {
    public static void main(String[] args) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int N = s.nextInt();
        Map<Integer, List<Integer>> coordinates = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int X = s.nextInt();
            int Y = s.nextInt();
            int R = s.nextInt();
            coordinates.put(i, Arrays.asList(X, Y, R));
        }
        int Xcordi = coordinates.get(0).get(0);
        int A = s.nextInt();
        int B = s.nextInt();

        for (int j = 0; j < N; j++) {

            if (coordinates.get(j).get(0) == Xcordi) {
                int lowerRange = coordinates.get(j).get(1) - coordinates.get(j).get(2);
                int upperRange = coordinates.get(j).get(1) + coordinates.get(j).get(2);

                if (lowerRange <= A && A <= upperRange) {
                    if (B <= upperRange) {
                        System.out.print(j + 1);
                        break;
                    } else {
                        A = upperRange;
                    }
                } else {
                    System.out.print(-1);
                }

            }
            System.out.print(-1);
        }


    }
}
