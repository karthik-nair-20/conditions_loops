package com.assigments;

import java.util.Scanner;

public class area_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int len = input.nextInt();
        int bed = input.nextInt();

        input.close();

        double area;
        area = len *bed;

        System.out.println(area);

    }
}
