package com.karthik;

import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double rad = input.nextFloat();
        double area;
        area = Math.PI * rad *rad;

        double roundValue = Math.round(area *10000.0)/10000.0;
        System.out.println(roundValue);

    }
}
