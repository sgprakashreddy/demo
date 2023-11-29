package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MReferenceDemo {
	
public static void main (String args[]) {
	
	EmployeeService employeeService = new EmployeeService();


	//1. Reference to Static Method
	//2. Reference to instance method of Object type
	//3. Reference constructor  constructor -> new
	

	//Lambda Approach
	EmployeeManager employeeManager=()-> new Employee();
	employeeManager.getEmployee().getEmployeeInfo();
	
	EmployeeManager employeeManager1=Employee::new;
	employeeManager1.getEmployee().getEmployeeInfo();
	
	 Stream<Object> listids = employeeService.loadEmployeeFromDB()
	.stream()
	.map(Employee::getId)
	.map(ArrayList::new);
	//.forEach(System.out::println);
	
	System.out.println("List of IDs --" +listids);
	 
	/*
	 * 
	 * // Annonymous implementation employeeService.loadEmployeeFromDB() //.stream()
	 * .forEach(new Consumer<Employee>() {
	 * 
	 * @Override public void accept(Employee employee) {
	 * System.out.println(" employyees > "+ employee); } });
	 * 
	 * System.out.println("----------------------------------------");
	 * 
	 * //Lambda expression employeeService.loadEmployeeFromDB() .forEach((employee)
	 * -> System.out.println(" employyees > "+ employee));
	 * 
	 * System.out.println("----------------------------------------");
	 * 
	 * //method reference employeeService.loadEmployeeFromDB()
	 * .forEach(MReferenceDemo::print);
	 * 
	 * System.out.println("----------------------------------------");
	 * 
	 * 
	 * // method reference with predefined class with custom type
	 * employeeService.loadEmployeeFromDB() .forEach(System.out::println);
	 * 
	 * System.out.println("----------------------------------------");
	 * 
	 * 
	 */
	
	// Un annoymous inner class style
	  List<EmployeeDO> empDos = employeeService.loadEmployeeFromDB()
	.stream()
	.map(new Function<Employee, EmployeeDO>() {
		@Override
		public EmployeeDO apply(Employee emp) {
			EmployeeDO edo= new EmployeeDO();
			edo.setId(emp.getId());
			edo.setName(emp.getName());
			edo.setAge(emp.getAge());
			edo.setDept(emp.getDept());
			edo.setGender(emp.getGender());
			edo.setSalary(emp.getSalary());
			return edo;
		}
	}).collect(Collectors.toList());
	  
	// lambda Style  
  List<EmployeeDO> empDos1 = employeeService.loadEmployeeFromDB()
	.stream()
	.map((emp) -> {
				EmployeeDO edo= new EmployeeDO();
				edo.setId(emp.getId());
				edo.setName(emp.getName());
				edo.setAge(emp.getAge());
				edo.setDept(emp.getDept());
				edo.setGender(emp.getGender());
				edo.setSalary(emp.getSalary());
				return edo;
			}
		).collect(Collectors.toList());
	  
  // With method reference
  List<EmployeeDO> empDos2 = employeeService.loadEmployeeFromDB()
	.stream()
	.map((emp) -> EmployeeMapper.convert(emp)  
		).collect(Collectors.toList());
  
  
  // With method reference static
  List<EmployeeDO> empDos3 = employeeService.loadEmployeeFromDB()
	.stream()
	.map(EmployeeMapper::convert).collect(Collectors.toList());
	  

  // object reference static
  
  EmployeeMapper employeeMapper = new EmployeeMapper();
  List<EmployeeDO> empDos4 = employeeService.loadEmployeeFromDB()
	.stream()
	.map(employeeMapper::convert1).collect(Collectors.toList());
  
//      System.out.println("---Unanoyimouse--Employee DOS--------" +empDos);
//	  System.out.println("--Lamda style---Employee DOS--------" +empDos1);
//	  System.out.println("--Method Reference---Employee DOS--------" +empDos2);
//	  System.out.println("--Static Method Reference---Employee DOS--------" +empDos3);
//	  System.out.println("--Instance method Reference---Employee DOS--------" +empDos4);


    List<String> empName = employeeService.loadEmployeeFromDB()
     .stream()
     .map(emp -> emp.getName()).collect(Collectors.toList());
     
    //method reference
    List<String> empName1 = employeeService.loadEmployeeFromDB()
    	     .stream()
    	     .map(Employee::getName).collect(Collectors.toList());
    
    //method reference
    List<String> empName2 = employeeService.loadEmployeeFromDB()
    	     .stream()
    	     .map(Employee::test).collect(Collectors.toList());
    
    //method reference should not have input then it considered as method reference else it will be instance method
//    List<String> empName2 = employeeService.loadEmployeeFromDB()
//    	     .stream()
//    	     .map(Employee::tester).collect(Collectors.toList());
    
//	    System.out.println(" List of Empoyee Name - "+empName);
//	    System.out.println(" List of Empoyee Name using Method reference - "+empName1);


}

		public static void print(Employee emp){
			System.out.println(" Employeees "+emp);
		}


		
}
