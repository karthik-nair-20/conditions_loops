package com.assigment2;

import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int sum =0;

        for(int i=1; i<=num/2;i++)
        {
            if(num%i == 0)
            {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
