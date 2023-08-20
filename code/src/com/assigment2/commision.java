package com.assigment2;

import java.util.Scanner;

public class commision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double com = in.nextDouble();
        double sale = in.nextDouble();

        double comper = (com/sale)*100;

        System.out.println(comper);
    }
}
