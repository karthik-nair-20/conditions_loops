package com.karthik;

import java.util.Scanner;

public class counting_occur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long num = in.nextLong();
        int n = in.nextInt();
        int count= 0;
        while(num >0){
            if (num %10 == n){
                count++;
            }
            num = num/10;

        }
        System.out.println(count);

        //76578587
    }
}
