package com.company;

import java.util.Scanner;

public class ReverseAnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
       while(0<n){
            int rem = n%10;
            n= n/10;
            ans = ans * 10 + rem;
        }
        System.out.print(ans);
    }
}
