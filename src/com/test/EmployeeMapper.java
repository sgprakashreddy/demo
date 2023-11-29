package com.test;

public class EmployeeMapper {
	
	
	
	//Static Instance Method reference
	public static EmployeeDO convert(Employee employee) {
		EmployeeDO edo= new EmployeeDO();
		edo.setId(employee.getId());
		edo.setName(employee.getName());
		edo.setAge(employee.getAge());
		edo.setDept(employee.getDept());
		edo.setGender(employee.getGender());
		edo.setSalary(employee.getSalary());
		return edo;
		
	}

	//Instance Method reference
	public EmployeeDO convert1(Employee employee) {
		EmployeeDO edo= new EmployeeDO();
		edo.setId(employee.getId());
		edo.setName(employee.getName());
		edo.setAge(employee.getAge());
		edo.setDept(employee.getDept());
		edo.setGender(employee.getGender());
		edo.setSalary(employee.getSalary());
		return edo;
		
	}

	
	
}
