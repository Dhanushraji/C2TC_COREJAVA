package com.tns.ifet.day6.thread.synchronization;

public class DepositLimitExceedsException extends Exception{
	public DepositLimitExceedsException()
	{
		super("Daily limit of Deposit is exceeded..");
	}
	public DepositLimitExceedsException(String message)
	{
		super(message);
	}
}