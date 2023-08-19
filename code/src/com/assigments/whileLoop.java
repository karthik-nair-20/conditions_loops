package com.assigments;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum =0;
        while(true)
        {
            int num = in.nextInt();
            if (num == 0)
            {
                break;
            }
            else {
                sum +=num;
            }
        }
        System.out.println(sum);
    }
}
