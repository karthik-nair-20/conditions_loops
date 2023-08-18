package com.karthik;

import java.util.Scanner;

public class reverse_str {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number(to be reversed)");
        int num = input.nextInt();

        //covert to string

        String numStr = Integer.toString(num);//converted num to str

        int right = numStr.length() - 1;

        String revStr = ""; ///a empty str
        while(right >=0)
        {
            revStr = revStr + numStr.charAt(right);
            right--;
        }
        //covert string to int

        int revStrInt = Integer.parseInt(revStr);

        System.out.println(revStrInt);

    }
}
