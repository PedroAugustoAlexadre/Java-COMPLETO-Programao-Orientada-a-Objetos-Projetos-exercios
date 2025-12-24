package org.example.entities;


public class Funcionario {

    public String nome;

    public double salario;

    public int taxa = 1000;

    public double SalarioLiquidoRetorno() {

        return this.salario = salario - taxa;

    }

    public double IncrementarSalario(double porc) {

        this.salario += this.salario * (porc / 100);
        return this.salario;
    }

    public String toString() {
        return """
                Nome: %s
                Salario: %f
                Tax: %d
                
                Salario Liquido: %f
                """.formatted(nome, salario, taxa, SalarioLiquidoRetorno());
    }
}
