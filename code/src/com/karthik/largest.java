package com.karthik;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = Math.max(Math.max(a,b) , c);

        System.out.println(max);
    }
}
