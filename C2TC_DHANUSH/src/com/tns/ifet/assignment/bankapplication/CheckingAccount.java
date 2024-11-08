package com.tns.ifet.assignment.bankapplication;

public class CheckingAccount extends Account {
	public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}