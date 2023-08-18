package com.karthik;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //0 1 1 2 3 5 8 13
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        int count = 2;
//        int next;
//        for (int i=0; i<= n; i++){
//            System.out.print(first + " ");
//            next = first +second;
//            first = second;
//            second = next;
//        }
        while (count <=n){
            int temp = second;

            second = second +first;

            first = temp;

            count++;

        }
        System.out.println(second);


    }
}
