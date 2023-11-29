package com.test;

public class Employee {
	
	private int id;
	private String name;
	private String dept;
	private int age;
	private String gender;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + ", gender=" + gender
				+ ", salary=" + salary + "]";
	}
	public Employee(int id, String name, String dept, int age, String gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	
	// can be accessed and it can be used as static as there is no input
	public String test() {
		return "xxx";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	// 
	public String tester(int b) {
		return "xxx";
	}
	
	public void getEmployeeInfo() {
		System.out.println("----IM a method in Employee CLASS---");
	}
	
}
