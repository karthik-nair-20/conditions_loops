package com.assigment2;

import java.util.Scanner;

public class hscf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();//48
        int b = in.nextInt();//18
        int a1 = a;
        int b1 = b;
        while(b1 != 0)
        {
            int temp = b1;//18 12 6
            b1  = a1 % b1;//12 6 0
            a1 = temp;//18 12 6
        }
        System.out.println(a1);
        int lcm = (a * b)/a1;
        System.out.println(lcm);
    }
}
