package com.tns.ifet.day5.overriding;

public class OverridingDemo {
	public static void main(String[] args) {
		RBI rbi;
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());
		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());
	}
}