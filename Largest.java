package com.company;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        // find the max of two numbers!
        int max = Math.max(a,b);
        System.out.println(max);
    }
}
