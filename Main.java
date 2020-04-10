package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Enter your choice: ");
        int choice;
        choice=input.nextInt();

        switch (choice){
            case 1:
                for (int i=0;i<4;i++){
                    System.out.println("******");
                }
                break;
            case 2:
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("*****");
                System.out.println("******");
                break;
            case 3:
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("enter your choice");
                break;
        }
    }

}
