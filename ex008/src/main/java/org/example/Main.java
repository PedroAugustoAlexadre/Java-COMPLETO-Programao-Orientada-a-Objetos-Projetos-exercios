package org.example;

import org.example.util.CurrencyConverter;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("valor do dolar");
        double valor_dolar = sc.nextDouble();

        System.out.print("quantidade de dolar pra comprar");
        double quantidade_dolar = sc.nextDouble();

        CurrencyConverter.TotalInReal(valor_dolar, quantidade_dolar);

    }
}