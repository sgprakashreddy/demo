package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStreamAdvanceMethods {

	public static void main(String[] args) {

		
		List<Employee> employee= new ArrayList() {{
			add(new Employee(1,"tom","IT",26,"male",25000));
			add(new Employee(2,"mohan","IT",32,"male",35000));
			add(new Employee(3,"richa","IT",22,"female",18000));
			add(new Employee(4,"harry","HR",28,"male",25900));
			add(new Employee(5,"lathan","IT",54,"male",45000));
			add(new Employee(6,"ganesh","hr",45,"male",42000));
			add(new Employee(7,"sania","HR",34,"female",27000));
			add(new Employee(8,"serena","HR",29,"female",22000));
			add(new Employee(9,"vijay","HR",31,"male",26100));
			add(new Employee(10,"raveena","Finance",37,"female",30000));
			add(new Employee(11,"mahesh","Admin",33,"male",29000));
			add(new Employee(12,"smith","Admin",27,"male",24600));
		}};
		
		// 01. Print the name of the employee whose salary is greater than 30000
		
//		employee.stream()
//		.filter(t -> t.getSalary()>30000)
//		.map(e->e.getName())
//		.forEach(System.out::println);
		
		// 02. Print the number of male and female employees
//		Map<String, Long> emp = employee.stream()
//		.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
//		
//		System.out.println(emp);
		
		// 03. print the name of the employee who is getting less (minimum) salary
		
//		Optional<Employee> minsalary = employee.stream().min(Comparator.comparingDouble(Employee::getSalary));
//		System.out.println(minsalary.get().getSalary() + "     " + minsalary.get().getName());
		
		// 04. print the name of the employee who is getting max (maximum) salary
		
//		Optional<Employee> maxsalary = employee.stream().max(Comparator.comparingDouble(Employee::getSalary));
//		System.out.println(maxsalary.get().getSalary() + "     " + maxsalary.get().getName());

		// 05. print the name of the employees from HR dept
	
//		employee.stream()
//		.filter(e -> e.getDept().equalsIgnoreCase("HR"))
//		.map(Employee::getName)
//		.forEach(System.out::println);
		
		//06. Find the older employees name,age, salary
//		Optional<Employee> oldage = employee.stream().max(Comparator.comparingDouble(Employee::getAge));
//		System.out.println("max saklary is " +oldage.get().getSalary() +" Name   " +oldage.get().getName());
		
		//07. Count the number of employees in each dept
		
//		Map<String, Long> deptcount = employee.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
//		System.out.println(deptcount);
	
		//08. average salary of male and female
//		Map<String, Double> avgsalary = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
//		System.out.println(avgsalary);
		
		//09. print average salary and total salary
//		Double avgsal = employee.stream().collect(Collectors.averagingDouble(Employee::getSalary));
//		Double totsal = employee.stream().collect(Collectors.summingDouble(Employee::getSalary));
//		System.out.println("Average Salary " +avgsal + " Total Salary " + totsal) ;
//		
//		DoubleSummaryStatistics summmrise = employee.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
//		System.out.println(" Avg Salary " +summmrise.getAverage() + " SUM  " + summmrise.getSum());
		
		//10. Create a Map with this list where EMP Id as Key and rest as value
		Map<Integer, Employee>  map = employee.stream().collect(Collectors.toMap(Employee::getId, e -> e ));
		System.out.println("Map with EmpId key and Values " +map);
		
		
		
	}

}
