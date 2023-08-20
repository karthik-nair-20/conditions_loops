package com.assigment2;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char input = in.next().trim().charAt(0);
        String inp = in.next();

        String inpU = inp.toLowerCase();
        System.out.println(inpU);
        char inputLower = Character.toLowerCase(input);
        switch(inputLower)
        {
            case 'a','e','i','o','u' -> System.out.println("vowel");
            default -> System.out.println("consonant");
        }

    }
}
