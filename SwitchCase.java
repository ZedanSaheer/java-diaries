package com.company;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write a fruit name!");
        String fruit = in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Keeps the doctor away!");
            case "Orange" -> System.out.println("King of vitamin C");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Invalid Fruit Name");
        }

    }
}
