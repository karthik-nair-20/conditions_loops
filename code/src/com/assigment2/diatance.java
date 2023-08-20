package com.assigment2;

import java.util.Scanner;

public class diatance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int dist = num1 - num2;

        System.out.println(Math.abs(dist));

    }
}
