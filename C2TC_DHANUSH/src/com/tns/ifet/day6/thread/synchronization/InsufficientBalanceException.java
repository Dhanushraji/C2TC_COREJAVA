package com.tns.ifet.day6.thread.synchronization;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException() {
		super("Insufficient balance in your account");
	}
	public InsufficientBalanceException(String message) {
		super(message);
	}
}