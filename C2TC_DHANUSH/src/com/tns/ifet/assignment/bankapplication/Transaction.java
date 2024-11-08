package com.tns.ifet.assignment.bankapplication;

public class Transaction {
	private final double transactionFee = 2.50;
    public final void performTransaction(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid transaction amount.");
            return;
        }
        double totalAmount = amount + transactionFee;
        System.out.println("Transaction successful.");
        System.out.println("Amount: " + amount);
        System.out.println("Transaction Fee: " + transactionFee);
        System.out.println("Total Amount Deducted: " + totalAmount);
    }
    public double getTransactionFee() {
        return transactionFee;
    }
    public static void main(String[] args) {
        Transaction transaction1 = new Transaction();
        transaction1.performTransaction(100.00);
    }
}