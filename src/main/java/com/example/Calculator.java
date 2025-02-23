package com.example;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator is running...");

        int num1 = 10;
        int num2 = 5;

        System.out.println("Sum: " + add(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));
        System.out.println("Quotient: " + divide(num1, num2));

        // Keeps container running
        while (true) {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }
}