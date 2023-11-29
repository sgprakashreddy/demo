package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NthHighSalary {

	public static void main(String[] args) {

		
		List<Employee> emplist= new ArrayList<>();
		emplist.add(new Employee(1,"mohan","hr",30,"male",8400));
		emplist.add(new Employee(2,"sheela","mech",40,"female",1400));
		emplist.add(new Employee(3,"rajesh","civil",60,"male",5400));
		emplist.add(new Employee(4,"siya","it",33,"female",4300));
		emplist.add(new Employee(5,"karmna","pp",35,"female",345430));

		//find the Nth - highest Salary 2nd
		Optional<Employee> sortedSalry = emplist.stream()
		.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		.skip(1)
		.findFirst();
	
//		System.out.println(sortedSalry);
		System.out.println(sortedSalry.get().getSalary());
		
//		// find the forth highest
		Optional<Double> salary4Highest = emplist.stream()
//		.map(t -> t.getSalary())
		.map(Employee::getSalary)
		.sorted(Comparator.reverseOrder())
		.skip(2).findFirst();
		
		System.out.println(salary4Highest.get());
		
		
	}

}
