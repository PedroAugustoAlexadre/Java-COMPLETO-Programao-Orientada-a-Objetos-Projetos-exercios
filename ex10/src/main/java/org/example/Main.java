package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0 && n < 10) {

            int[] vect  = new int[n];

            for (int i = 0; i < vect.length; i++) {

                int n2 = sc.nextInt();

                vect[i] = n2;

            }

            for (int i = 0; i < vect.length; i++) {

                if (vect[i] < 0) {

                    System.out.println("%d e menor que zero".formatted(vect[i]));

                }

            }
        } else {

            System.out.println("seu numerp deve ser menor que 10 e maior que 0");

        }

    }
}