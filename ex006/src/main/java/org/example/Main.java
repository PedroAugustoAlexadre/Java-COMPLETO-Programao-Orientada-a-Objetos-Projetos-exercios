package org.example;

import org.example.entities.Funcionario;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salario: ");
        funcionario.salario = sc.nextDouble();

        System.out.println(funcionario);

        System.out.print("quando em porcentagem quer aumentar o salario: ");

        double porc = sc.nextInt();

        System.out.print("seu salario agora e %f".formatted( funcionario.IncrementarSalario(porc) ));


    }
}