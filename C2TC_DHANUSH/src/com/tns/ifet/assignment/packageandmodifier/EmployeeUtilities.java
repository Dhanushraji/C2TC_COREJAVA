package com.tns.ifet.assignment.packageandmodifier;
import com.tns.ifet.assignment.packageandmodifier.Employee;
import com.tns.ifet.assignment.packageandmodifier.Manager;
import com.tns.ifet.assignment.packageandmodifier.Developer;
public class EmployeeUtilities {
	public static void printEmployeeDetails(Employee employee) 
	{
		 System.out.println("Employee Name: " + employee.getName());
		 System.out.println("Employee ID: " + employee.getEmployeeId());
		 System.out.println("Salary: " + employee.getSalary());
		 if (employee instanceof Manager) 
		 {
		 Manager manager = (Manager) employee;
		 System.out.println("Department: " + manager.getDepartment());
		 } 
		 else if (employee instanceof Developer) 
		 {
		 Developer developer = (Developer) employee;
		 System.out.println("Programming Language: " + developer.getProgrammingLanguage());
		 }
		 System.out.println();
		 }
}