package com.BasicCoreProgram;

public class PowerTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 0;
        int PowerOfTwo = 1;
        while (i <= n){
            String powerOfTwo;
            System.out.println(i + " " + PowerOfTwo);
            PowerOfTwo =2* PowerOfTwo;
            i =i +1;
        }
    }
}
