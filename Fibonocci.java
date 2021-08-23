package com.company;

import java.util.Scanner;

public class Fibonocci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c;
        int count = 0;

        System.out.print(a+" "+b);

        for(count=0 ; count<=n ; count++){
           c= a+b;
           a=b;
           b=c;
            System.out.print(" "+b);
        }

   //     while(count <= n){
     //       int temp = b;
       //     b=b+a;
         //   a=temp;
           // count++;
        //}
        //System.out.println(b);
    }
}
