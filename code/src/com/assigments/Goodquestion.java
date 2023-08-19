package com.assigments;

import java.util.Scanner;

public class Goodquestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int product = 1;
        int sum = 0;
        while(num >0)
        {
            int num2 = num %10;
            sum += num2;
            product *=num2;
            num = num/10;
        }
        int result = product -sum;
        System.out.println("Result: " + result);

    }
}
