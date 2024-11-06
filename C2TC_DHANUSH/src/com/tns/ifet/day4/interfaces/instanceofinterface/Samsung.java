package com.tns.ifet.day4.interfaces.instanceofinterface;

public class Samsung implements Phone {
	@Override
	public void call() {
		System.out.println("Calling using Samsung");
	}
	@Override
	public void sms() {
		System.out.println("Messaging using Samsung");
	}
}