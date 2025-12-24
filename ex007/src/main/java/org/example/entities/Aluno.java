package org.example.entities;

public class Aluno {

    public String name;

    public double nota1;

    public double nota2;

    public double nota3;

    public double media;

    public void CalcurarMedia() {

        this.media = (nota1 + nota2 + nota3) / 3.0;
    }

    public void PassouDeAno() {

        if (media >= 6.0) {
            System.out.println("PASSOU");
        } else {
            System.out.println("VOCE NAO PASSOU DE ANO");
            System.out.println("FALTA " + (6.0 - media));
        }
    }
}
