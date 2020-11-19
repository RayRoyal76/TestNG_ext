package com.rs.testng;

public class EmployeeDetails {
	
	private String name;
	private double monthlySalary;
	private int age;
	
	// return name
	public String getName() {
		return name;
	}
	
	//param name the name to set
	public void setName(String name) {
		this.name = name;
	}
	
	// return monthlySalary
	public double getMonthlySalary() {
		return monthlySalary;
	
	}
	
	// param monthlySalary the monthlySalary to set
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	// return age
	public int age() {
		return age;
		
	}
	// param age the age to set
	public void setAge(int age) {
		this.age = age;
	}

}
