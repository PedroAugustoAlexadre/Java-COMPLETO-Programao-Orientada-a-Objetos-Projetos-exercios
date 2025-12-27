package org.example;

import org.example.utils.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered");
        int counter = sc.nextInt();

        List<Pessoa> pessoaList = new ArrayList<>();

        for (int i = 0; i < counter; i++) {

            System.out.print("Employee: " + counter);

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.println("NAME: ");
            String name = sc.nextLine();

            System.out.println("SALARY: ");
            double salary = sc.nextDouble();

            pessoaList.add(new Pessoa(id, name, salary));

        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idPessoa = sc.nextInt();

        System.out.print("Enter the percentage");
        int porcent = sc.nextInt();


        Pessoa pessoa = pessoaList.stream()
                .filter(p -> p.getId() == idPessoa)
                .findFirst()
                .orElse(null);


    }
}