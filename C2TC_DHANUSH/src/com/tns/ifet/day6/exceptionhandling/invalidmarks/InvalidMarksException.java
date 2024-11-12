package com.tns.ifet.day6.exceptionhandling.invalidmarks;

public class InvalidMarksException extends Exception{
	public InvalidMarksException() {
		super();
	}
	public InvalidMarksException(String message) {
		super(message);
	}
}