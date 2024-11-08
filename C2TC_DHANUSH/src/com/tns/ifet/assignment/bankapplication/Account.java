package com.tns.ifet.assignment.bankapplication;

public abstract class Account {
	protected double balance;
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public void displayAccountInfo() {
        System.out.println("Current Balance: " + balance);
    }
}