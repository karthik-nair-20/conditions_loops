package com.assigment2;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count=0;
        int temp = num;
       double sum =0.0;
       boolean isArm = false;
//        while(temp>0)
//        {
//            int rem = temp%10;
//           count++;
//            temp = temp/10;
//        }
        int count1 = String.valueOf(num).length(); //convert int to string then int
        temp = num; //reset temp to num
        while (temp >0)
        {
            int rem = temp%10;
            sum += Math.pow(rem, count1);//sum total
            temp = temp/10;
        }

        int sumInt = (int) sum;//type casting double to int
        if(sumInt == num)
        {
            isArm = true;
        }
        if (isArm)
        {
            System.out.println("is a armstrong number");
        }
        else {
            System.out.println("is not a armstrong number");
        }

    }
}
