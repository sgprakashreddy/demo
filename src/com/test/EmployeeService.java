package com.test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeService {

	public List<Employee> loadEmployeeFromDB(){
		return IntStream.rangeClosed(1, 10)
				.mapToObj(i -> new Employee(i,"Employee"+i, "HR", 30+i*i, "MALE",new Random().nextDouble()*100))
				.collect(Collectors.toList());
	}
	
}
