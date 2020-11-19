package com.rs.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployeeDetails {
	
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();
	
	
	@Test
	public void testCalculateAppraisal() {
		
		employee.setName("Rayvon");
		employee.setAge(44);
		employee.setMonthlySalary(8500);
		
		
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		Assert.assertEquals(500, appraisal, 0.0, "500");
	}
	
	// Test to check yearly salary
	@Test
	public void testCalculateYearlySalary() {
		
		employee.setName("Rayvon");
		employee.setAge(44);
		employee.setMonthlySalary(8500);
		
		double salary = empBusinessLogic.calculateYearlySalary(employee);
		Assert.assertEquals(102000,  salary, 0.0, "8500");
		
	}
	

}
