package com.tns.ifet.day5.overriding.covariant;

class Student implements Cloneable {
	int rollNo;
	String className;
	String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int rollNo, String className, String name) {
		this.rollNo = rollNo;
		this.className = className;
		this.name = name;
	}
	public void printData() {
		System.out.println("Name : " + name + ", RollNo: " + rollNo + ", Class Name : " + className);
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}