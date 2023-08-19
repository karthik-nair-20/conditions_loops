package com.assigments;

import java.util.Scanner;

public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int len = in.nextInt();

        double peri = 4 *len;

        System.out.println("the perimeter is " + peri);
    }
}
