package com.karthik;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number1");
        int num1 = input.nextInt();

        System.out.println("Enter a number2");
        int num2 = input.nextInt();

        System.out.println("enter the operation");
        char op = input.next().trim().charAt(0);

        int ans =0;
        while(true) {
            if (op == '+') {
                ans = num1 + num2;
                break;
            } else if (op == '-') {
                ans = num1 - num2;
                break;
            } else if (op == '/') {
                if (num1 != 0 || num2 != 0) {
                    ans = num1 / num2;
                    break;
                }
            } else if (op == '*') {
                ans = num1 * num2;
                break;
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("enter a valid operation");
            }
        }
        System.out.println(ans);

    }
}
