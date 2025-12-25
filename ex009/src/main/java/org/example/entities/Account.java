package org.example.entities;

import java.util.SplittableRandom;

public class Account {

    private int account_number;

    private String account_name;

    private double balance;

    public void Deposit(double balance) {

        this.balance += balance;

    }

    public void Withdrawn(double balance) {

        this.balance -= balance;

    }


    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
