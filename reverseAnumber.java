package com.company;

import java.util.Scanner;

public class ReverseAnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i<=n ; i++){
            int rem = n%10;
            n= n/10;
            System.out.print(rem);
        }
    }
}
