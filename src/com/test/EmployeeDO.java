package com.test;

public class EmployeeDO {

	private int id;
	private String name;
	private String dept;
	private int age;
	private String gender;
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	private double salary;
	
	public EmployeeDO() {
	
	}

	@Override
	public String toString() {
		return "EmployeeDO [id=" + id + ", name=" +name + ", dept=" + dept + ", age=" + age + ", gender=" + gender
				+ ", salary=" + salary + "]";
	}


	public EmployeeDO(int id, String name, String dept, int age, String gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}


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
	
	
	
}
