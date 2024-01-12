package com.prowings.complexCollection;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleOfEmployee {

	public static void main(String[] args) {

		// create a list of Employees

		ArrayList<Employee> al = new ArrayList<>();
		Employee emp2 = new Employee(456, "EFG", 20000, "Soft Dev");
		Employee emp3 = new Employee(789, "HIJ", 30000, "PMO");
		Employee emp1 = new Employee(123, "ABC", 10000, "QA");

		al.add(emp1);
		al.add(emp3);
		al.add(emp2);

		Collections.sort(al);
		System.out.println(al);

		System.out.println("Second Highest Salary : " + al.get(1).getName());
		System.out.println(al.get(1).getId());
		System.out.println(al.get(1).getDepartment());
		System.out.println(al.get(1).getSalary());

	}

}
