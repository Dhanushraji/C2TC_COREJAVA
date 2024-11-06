package com.tns.ifet.day4.staticvariable;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee e = new Employee("Dhanush", 28);
		System.out.println(e);
		e = new Employee("Deep", 321);
		System.out.println(e);
	}
}