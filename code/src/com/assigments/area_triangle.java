package com.assigments;

import java.util.Scanner;

public class area_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length");
        int length = in.nextInt();

        System.out.println("enter the height");
        int height = in.nextInt();

        in.close();

        double area = 0.5 * length *height;

        System.out.println("the area is "+area);

    }
}
