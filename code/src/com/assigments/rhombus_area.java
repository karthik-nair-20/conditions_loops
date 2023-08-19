package com.assigments;

import java.util.Scanner;

public class rhombus_area {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int dia1 = in.nextInt();

        int dia2 = in.nextInt();

        double area = (dia1 *dia2)/2;

        System.out.println("the area is " + area);
    }
}
