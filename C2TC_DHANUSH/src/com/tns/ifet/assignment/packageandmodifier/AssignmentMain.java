package com.tns.ifet.assignment.packageandmodifier;
import com.tns.ifet.assignment.packageandmodifier.Manager;
import com.tns.ifet.assignment.packageandmodifier.Developer;
import com.tns.ifet.assignment.packageandmodifier.EmployeeUtilities;
public class AssignmentMain {
	public static void main(String[] args) {
		Manager manager = new Manager("Hariram", 50, 90000, "Sales");
		 Developer developer = new Developer("Dhanush", 28, 80000, "Java");
		 EmployeeUtilities.printEmployeeDetails(manager);
		 EmployeeUtilities.printEmployeeDetails(developer);
		 }
}