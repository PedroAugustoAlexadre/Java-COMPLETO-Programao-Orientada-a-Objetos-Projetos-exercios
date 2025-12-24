package org.example;

import org.example.entities.Aluno;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("nome do aluno");
        aluno.name = sc.nextLine();

        System.out.print("nota primeiro bimeste: ");
        aluno.nota1 = sc.nextDouble();

        System.out.print("nota segundo bimeste: ");
        aluno.nota1 = sc.nextDouble();

        System.out.print("nota terceiro bimeste: ");
        aluno.nota1 = sc.nextDouble();

        aluno.CalcurarMedia();

        System.out.print("nota final" + aluno.media);
        aluno.PassouDeAno();

    }
}