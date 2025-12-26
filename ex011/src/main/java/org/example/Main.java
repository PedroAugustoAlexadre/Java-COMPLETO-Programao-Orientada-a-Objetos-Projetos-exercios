package org.example;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?");
        int contador = sc.nextInt();

        int[] vect = new int[contador];

        int sum = 0;

        int media;

        for (int i = 0; i < vect.length; i++) {

            System.out.print("Digite um numero:");
            int n = sc.nextInt();
            vect[i] = n;

        }

        System.out.println("item: " + Arrays.toString(vect));

        for (int i = 0; i < vect.length; i++) {

            sum += vect[i];

        }

        System.out.println("SOMA = " + sum);

        media = sum / contador;

        System.out.println("MEDIA = " + media);




    }
}