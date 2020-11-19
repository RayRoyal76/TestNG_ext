package com.rs.testng;

public class EmpBusinessLogic {
	
	private double yearlySalary;
	private double appraisal;
	
	
// return yearlySalary
	public double getYearlySalary() {
		return yearlySalary;
		
	}
// param yearlySalary the yearlySalary to set
	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
// return appraisal
	public double getAppraisal() {
		return appraisal;
	}
// param appraisal the appraisal to set
	public void setAppraisal(double appraisal) {
		this.appraisal = appraisal;
	}
// calculate the yearly salary of employee
	public double calculateYearlySalary(EmployeeDetails employeeDetails) {
		double yearlySalary = 0;
		yearlySalary = employeeDetails.getMonthlySalary() * 12;
		return yearlySalary;
	}
// calculate the appraisal amount of employee
	public double calculateAppraisal(EmployeeDetails employeeDetails) {
		double appraisal = 0;
		if(employeeDetails.getMonthlySalary() < 10000) {
			appraisal = 500;
		}
		else {
			appraisal = 1000;
		}
		return appraisal;
	}

}
