package com.assigment2;

import java.util.Scanner;

public class palindrome_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        boolean isPalin = false;
        int left = 0;
        int right = String.valueOf(num).length() -1;//int to str to int
        while(left < right)
        {
            String numStr = Integer.toString(num);//int to str
            if(numStr.charAt(left) == numStr.charAt(right))
            {
                isPalin = true;
            }
            left++;
            right--;
        }
        if (isPalin)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
