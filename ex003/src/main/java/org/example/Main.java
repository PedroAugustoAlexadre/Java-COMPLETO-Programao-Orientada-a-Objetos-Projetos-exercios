package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("numero A: ");
        int a = sc.nextInt();

        System.out.print("numero B: ");
        int b = sc.nextInt();

        System.out.print("numero C: ");
        int c = sc.nextInt();

        System.out.print("numero D: ");
        int d = sc.nextInt();

        int diferenca = (a * b - d * c);

        System.out.println("DIFERENÇA = " + diferenca);

    }
}