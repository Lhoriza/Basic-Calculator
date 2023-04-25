package com.lhoriza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userFirstNumber = 0;
        int userSecondNumber = 0;
        String userOperation = "";
        boolean validOperation = false;
        boolean validFirstNumber = false;
        boolean validSecondNumber = false;
        Scanner appScanner = new Scanner(System.in);

        while (!validFirstNumber) {
            System.out.println("Enter first number: ");
            if (appScanner.hasNextInt()) {
                userFirstNumber = appScanner.nextInt();
                validFirstNumber = true;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                appScanner.nextLine();
            }
        }

        appScanner.nextLine();

        while (!validSecondNumber) {
            System.out.println("Enter second number: ");
            if (appScanner.hasNextInt()) {
                userSecondNumber = appScanner.nextInt();
                validSecondNumber = true;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                appScanner.nextLine();
            }
        }

        appScanner.nextLine();

        while (!validOperation) {
            System.out.println("Select an operation (+, -, *, /): ");
            userOperation = appScanner.nextLine();

            if (userOperation.equals("+")) {
                int result = userFirstNumber + userSecondNumber;
                System.out.println("Result: " + userFirstNumber + " + " + userSecondNumber + " = " + result);
                validOperation = true;
            } else if (userOperation.equals("-")) {
                int result = userFirstNumber - userSecondNumber;
                System.out.println("Result: "  + userFirstNumber + " - " + userSecondNumber + " = " + result);
                validOperation = true;
            } else if (userOperation.equals("*")) {
                int result = userFirstNumber * userSecondNumber;
                System.out.println("Result: "  + userFirstNumber + " * " + userSecondNumber + " = " + result);
                validOperation = true;
            } else if (userOperation.equals("/")) {
                int result = userFirstNumber / userSecondNumber;
                System.out.println("Result: "  + userFirstNumber + " / " + userSecondNumber + " = " + result);
                validOperation = true;
            } else {
                System.out.println("Invalid input. Please enter an operation (+, -, *, /).");
            }
        }
    }
}
