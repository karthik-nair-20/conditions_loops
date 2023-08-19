package com.assigments;

import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int len = in.nextInt();

        int wid = in.nextInt();

        double peri = 2*(len+wid);

        System.out.println("the perimeter is " + peri);
    }
}
