package com.capgemini.employee.model;

public class MarketingExecutive extends Employee {

	private long kilometersTravelled;
	private double tourAllowance;
	private static long telephoneAllowance = 1500;

	public MarketingExecutive() {
		super();	
	}

	public MarketingExecutive(int employeeId, String employeeName, double basicSalary, double medicle , long kilometersTravelled) {
		super(employeeId, employeeName, basicSalary, medicle);
		this.kilometersTravelled = kilometersTravelled;
		this.tourAllowance = 5* kilometersTravelled;
	}
	
	public double calculateGrossSalary() {
		double grossSalary = super.calculateGrossSalary() + tourAllowance + telephoneAllowance;
		super.setGrossSalary(grossSalary);
		return grossSalary;
	}

	
	
	
	
}
