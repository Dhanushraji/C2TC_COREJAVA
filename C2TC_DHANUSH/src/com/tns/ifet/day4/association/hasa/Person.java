package com.tns.ifet.day4.association.hasa;

public class Person {
	private String name;
	private Address address;
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address.getStreet() + ", " + address.getCity() + ", " + address.getState()+ " " + address.getPostalCode());
	}
}