package com.tns.ifet.day4.interfaces.functionalinterfaces;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		GreetClass g = new GreetClass();
		System.out.println(g.greet());
		GreetInterface g1 = () -> {
			return "Good Afternoon";
		};
		System.out.println(g1.greet());
	}
}