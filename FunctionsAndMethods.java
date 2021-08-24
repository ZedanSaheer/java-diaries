package com.company;

import java.util.Scanner;

public class FunctionsAndMethods {
    public static void main(String[] args) {
       int ans = sumWithParams(10,32);
        System.out.println(ans);
    }

    static int sumWithReturn(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter another number");
        int b = in.nextInt();
        int sum = a + b;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter another number");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("Your answer is" + " " + sum);
    }

    static int sumWithParams(int a, int b){
        int sum = a+b;
        return sum;
    }
}
