package org.example.utils;


public class Pessoa {

    private int id;

    private String name;

    private double salary;

    public Pessoa(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;

    }




    public double getSalary() {
        return salary;
    }


    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }



}
