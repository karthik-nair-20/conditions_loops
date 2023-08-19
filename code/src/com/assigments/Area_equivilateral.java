package com.assigments;

import java.util.Scanner;

public class Area_equivilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the side length");
        int len = in.nextInt();

        double area = (Math.pow(len,2) * Math.sqrt(3))/4;

        double round = Math.round(area *10000.0)/10000.0;

        System.out.println("the area is " + round);
    }
}
