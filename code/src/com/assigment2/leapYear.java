package com.assigment2;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        boolean leapYear = false;
        if(year%4 == 0 )
        {
            if(year%100 !=  0 || year%400 == 0)
            {
                leapYear = true;
            }

        }
        if (leapYear)
        {
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }


    }
}
