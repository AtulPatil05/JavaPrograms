package com.prowings.complexCollection;

import java.util.Comparator;

public class EmployeeComparatorBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		if (e1.getSalary() == e2.getSalary())
			return 0;
		else if (e1.getSalary() > e2.getSalary())
			return -2;
		else
			return 3;
	}

}
