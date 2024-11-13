package com.tns.ifet.day7.list.userdefinedobjects.comparableandcomparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Point
{
	float x,y;
	Point()
	{}
	Point(float x, float y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}	
}
public class ListDemo {
	public static void main(String[] args) {
		Point p1=new Point(12,4.5f);
		Point p2=new Point(10,20);
		List<Point> pList=new ArrayList<Point>();
		pList.add(p1);
		pList.add(p2);
		System.out.println(pList);
		//Collections.sort(pList);
		List<Student> studentList = new ArrayList<Student>();
		Student s1 = new Student(11, "Pooja", 78);
		studentList.add(s1);
		s1 = new Student(21, "Nikita", 85);
		studentList.add(s1);
		s1 = new Student(13, "Deepa", 68);
		studentList.add(s1);
		s1 = new Student(41, "Neha", 72);
		studentList.add(s1);
		System.out.println("Students Details are as follows\n" + studentList);
		System.out.println("---------------Student Details Before Sorting-------------------");
		System.out.println(studentList);
		Collections.sort(studentList);
		System.out.println("---------------Student Details After Sorting-------------------");
		System.out.println(studentList);
		List<Person> personList = new ArrayList<Person>();
		Person p111 = new Person("Abhijit", "Mumbai");
		personList.add(p111);
		p111 = new Person("Milind", "Pune");
		personList.add(p111);
		p111 = new Person("Saurav", "Bangalore");
		personList.add(p111);
		p111 = new Person("Madhur", "Delhi");
		personList.add(p111);
		System.out.println("Person list is as follows\n" + personList);
		System.out.println("---------------Person Details Before Sorting-------------------");
		System.out.println(personList);
		Collections.sort(personList, new SortByName());
		System.out.println("---------------Person Details After Sorting by Name -------------------");
		System.out.println(personList);
		Collections.sort(personList, new SortByCity());
		System.out.println("---------------Person Details After Sorting by City -------------------");
		System.out.println(personList);
	}
}