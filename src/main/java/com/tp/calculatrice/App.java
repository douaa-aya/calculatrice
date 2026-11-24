package com.tp.calculatrice;

public class App {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int soustraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zero impossible");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println("Addition : " + addition(10, 5));
        System.out.println("Soustraction : " + soustraction(10, 5));
        System.out.println("Multiplication : " + multiplication(10, 5));
        System.out.println("Division : " + division(10, 5));
    }
}
