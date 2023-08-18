package com.karthik;

import java.util.Scanner;

public class counting_occur_str {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number");
        int digitNum = input.nextInt();

        System.out.println("enter the number(to be counted)");
        int num = input.nextInt();

        //converting to string

        String digitNumStr = Integer.toString(digitNum); //covert to sting

        char numChar = Character.forDigit(num,10); //convert to char

        // forDigit method takes two arguments: the digit to be converted and the radix (base).
        // In this case, we use a radix of 10 because we're working with decimal digits (0-9).

        int count =0;
        for(int i=0; i <digitNumStr.length(); i++){

            //convert digit string to char

            char digitNumChar = digitNumStr.trim().charAt(i);
            if (digitNumChar == numChar){
                count++;
            }
        }
        System.out.println("the occurance is "+ count);
    }
}
