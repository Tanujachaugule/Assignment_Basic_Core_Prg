package com.BasicCoreProgram;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        number = sc.nextInt();

        for(int i = 2; i< number; i++)
        {
            while (number%1 == 0){
                System.out.println(i + " ");
                number = number/i;
            }
        }
        if(number >2){
            System.out.println(number);
        }

    }
}
