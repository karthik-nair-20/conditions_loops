package com.assigments;

import java.util.Scanner;

public class PerimeterCircle {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int rad = in.nextInt();

        double area = 2 * Math.PI * rad;

        double roundArea = Math.round(area *10000.0)/10000.0;

        System.out.println("the area is " + roundArea);
    }
}
