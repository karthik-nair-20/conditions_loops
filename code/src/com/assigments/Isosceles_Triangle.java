package com.assigments;

import java.util.Scanner;

public class Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the base");
        int base = in.nextInt();

        System.out.println("enter the height");
        int height = in.nextInt();

        in.close();

        double area = 0.5 *base *height;
        System.out.println("the area is " + area);
    }
}
