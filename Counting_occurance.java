package com.company;

import java.util.Scanner;

public class Counting_occurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        System.out.println("The Number to check occurance");
        int check = in.nextInt();
        int count = 0;

        while(count<=n){
            int rem = n%10;
            if(check==rem){
                count++;
            }
            n=n/10;
        }
        System.out.print("Count of the recurring number is");
        System.out.print(" :"+count);
    }
}
