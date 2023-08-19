package com.assigments;

import java.util.Scanner;

public class VolumeCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rad = in.nextInt();

        int height = in.nextInt();

        double area = (1.0/3.0) * Math.PI * Math.pow(rad,2) * height;

        System.out.println(area);

    }
}
