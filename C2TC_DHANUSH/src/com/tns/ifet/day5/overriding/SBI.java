package com.tns.ifet.day5.overriding;

public class SBI extends RBI {
	@Override
	public float getRateOfInterest() {
		return 7.0f;
	}
	public SBI getObject() {
		return this;
	}
}