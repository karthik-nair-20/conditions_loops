package com.assigments;

import java.util.Scanner;

public class Tsa_cube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int side = in.nextInt();

        double tsa = 6 * Math.pow(side,2);

        System.out.println(tsa);
    }
}
