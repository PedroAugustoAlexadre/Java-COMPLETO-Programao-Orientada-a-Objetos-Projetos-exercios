package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite um numero: ");

        double num1 = sc.nextDouble();

        System.out.print("digite outro numero: ");

        double num2 = sc.nextDouble();

        double soma = num1 + num2;

        System.out.println("SOMA = " + soma);

    }
}