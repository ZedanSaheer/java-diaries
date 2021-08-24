package com.company;

import  java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter employee ID :");
        int empID = in.nextInt();
        System.out.println("Enter employee Deparment");
        String department = in.next();

        switch (empID) {
            case 1 -> {
                switch (department) {
                    case "IT" -> System.out.println("Zedan Saheer, IT Department");
                    case "Management" -> System.out.println("Zedan Saheer, Management Department");
                    default -> System.out.println("No department entered!");
                }
            }
            case 2 -> {
                switch (department) {
                    case "IT" -> System.out.println("Zedan saheer , IT Department");
                    case "Management" -> System.out.println("Zedan Saheer, Management Department");
                    default -> System.out.println("No department entered!");
                }
            }
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("Saheer cp, IT Department");
                    case "Management" -> System.out.println("Saheer cp, Management Department");
                    default -> System.out.println("No department entered!");
                }
            }
            default -> System.out.println("Enter Correct Employee ID!");
        }
    }
}
