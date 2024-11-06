package com.tns.ifet.day4.interfaces.nestedinterfaces;

public class NestedInterfaceClass implements MyInterface.MyInnerInterface {
	@Override
	public void print() {
		 System.out.println("Print method of nested interface");
	}
}