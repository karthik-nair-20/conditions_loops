package com.assigments;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //0 1 1 2 3 5 8

        int first =0;
        int second = 1;
        int count =2;
        int n = input.nextInt();
        while(count <= n){

            int temp = second;
            second = second +first;
            first = temp;

            count++;
        }
        System.out.println(second);

    }
}
