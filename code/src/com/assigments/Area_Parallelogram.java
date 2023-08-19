package com.assigments;

import java.util.Scanner;

public class Area_Parallelogram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the base");
        int base = in.nextInt();

        System.out.println("enter the height");
        int height = in.nextInt();

        double area = base *height;

        System.out.println("the area is " + area);

    }
}
