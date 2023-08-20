package com.assigment2;

import java.util.Scanner;

public class avrage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the number of sub");
        int num = in.nextInt();
        int sum =0;
        int avg;
        for (int i=1;i<=num; i++)
        {
            int mark = in.nextInt();
            sum +=mark;
        }
        avg = sum/num;
        System.out.println("avg is " + avg);
    }
}
