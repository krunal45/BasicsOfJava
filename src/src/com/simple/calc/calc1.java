package com.simple.calc;

import java.util.Scanner;

public class calc1 {
    Scanner scanner = new Scanner(System.in);
    Double i1, i2;
    char c1, c2;

    public static void main(String[] args) {
        calc1 c = new calc1();
        c.input();
    }

    public void input() {
        while (true) {
            System.out.println("Enter 2 numbers :");
            i1 = scanner.nextDouble();
            i2 = scanner.nextDouble();
            System.out.println(" + * / -");
            c1 = scanner.next().charAt(0);
            operate(c1);
            System.out.println("Do you want to continue? Y/N");
            c2 = scanner.next().charAt(0);
            if (c2 == 'N' || c2 == 'n')
                break;
        }
    }

    public void operate(char operation) {
        switch (operation) {
            case '+':
                System.out.println(i1 + i2);
                break;
            case '-':
                System.out.println(i1 - i2);
                break;
            case '*':
                System.out.println(i1 * i2);
                break;
            case '/':
                System.out.println(i1 / i2);
                break;
            default:
                System.out.println("Invalid operation selected");
                break;

        }
    }
}
