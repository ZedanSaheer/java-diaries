package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("Please Select Operator : \n * \n % \n + \n - \n /  \n If you want to exit this application press X or x!");
            char op = in.nextLine().trim().charAt(0);
            if(op == '+'|| op == '/'|| op == '%'|| op == '*'|| op == '-'){
                // input two numbers
                System.out.println("Enter First Number :");
                int a = in.nextInt();
                System.out.println("Enter Second Number :");
                int b = in.nextInt();

                if (op == '+') {
                    System.out.println("The Answer is :");
                    System.out.println(a + b);
                }
                if (op == '-') {
                    System.out.println("The Answer is :");
                    System.out.println(a - b);
                }
                if (op == '/') {
                    System.out.println("The Answer is :");
                    System.out.println(a / b);
                }
                if (op == '*') {
                    System.out.println("The Answer is :");
                    System.out.println(a * b);
                }
                if (op == '%') {
                    System.out.println("The Answer is :");
                    System.out.println(a % b);
                }
            }
            else if (op == 'x' || op == 'X'){
                    break;
                }
            else{
                System.out.println("Invalid Operator , Sorry!");
            }
        }
    }
}
