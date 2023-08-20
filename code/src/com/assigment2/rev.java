package com.assigment2;

import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//
//        int num = in.nextInt();//123
//        int sum =0;
//        while(num >0)
//        {
//            int rem = num%10;
//
//            sum = sum *10 +rem;
//
//            num = num/10;
//        }
//        System.out.println(sum);


        String input = in.next();
//        String str = "";
//        int left = 0;//left end
//        int right = input.length()-1; //right end
//
//        while(right >=0)
//        {
//            str = str + input.charAt(right);
//            right--;
//        }
        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println(reverse);


    }
}
