package com.assigments;

import java.util.Scanner;

public class largestTill0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int largest=Integer.MIN_VALUE;

        while (true)
        {
            int num = in.nextInt();
            if(num == 0)
            {
                break;
            }
            if (num > largest)
            {
                largest = num;
            }
        }
        if (largest != Integer.MIN_VALUE)
        {
            System.out.println("the largest number is " + largest);

        }
        else {
            System.out.println("Please enter a number!!");
        }
    }
}
