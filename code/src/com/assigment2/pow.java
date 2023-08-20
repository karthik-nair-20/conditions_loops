package com.assigment2;

import java.util.Scanner;

public class pow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        double pow = Math.pow(num,2);


        System.out.println(pow);
    }
}
