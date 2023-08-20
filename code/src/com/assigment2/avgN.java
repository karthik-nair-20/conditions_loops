package com.assigment2;

import java.util.Scanner;

public class avgN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //2+3+4/3
        int sum =0;
        System.out.println("enter the number of numbers");
        int num = in.nextInt();

        int count=0;
        int numbers;
        while(count <num)
        {
           numbers =  in.nextInt();
           sum += numbers;
            count++;
        }
        int avg = sum/num;
        System.out.println(avg);


    }
}
