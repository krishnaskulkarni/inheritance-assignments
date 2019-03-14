package com.capgemini.employee.model;

public class Manager extends Employee {
	
	double petrolAllowance;
	double foodAllowance;
	double otherAllowance;
	
	public Manager() {
		super();
	}
	
	public Manager(int employeeId, String employeeName, double basicSalary, double medicle) {
		super(employeeId, employeeName, basicSalary, medicle);
		this.petrolAllowance = 0.08* basicSalary;
		this.foodAllowance = 0.13* basicSalary;
		this.otherAllowance = 0.03*basicSalary;
	}

	public double getPetrolAllowance() {
		return petrolAllowance;
	}

	public void setPetrolAllowance(double petrolAllowance) {
		this.petrolAllowance = petrolAllowance;
	}

	public double getFoodAllowance() {
		return foodAllowance;
	}

	public void setFoodAllowance(double foodAllowance) {
		this.foodAllowance = foodAllowance;
	}

	public double getOtherAllowance() {
		return otherAllowance;
	}

	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	
	public double calculateGrossSalary() {
		double grossSalary = super.calculateGrossSalary() + petrolAllowance + foodAllowance + otherAllowance;
		setGrossSalary(grossSalary);
		
		return grossSalary;//edited
	}
	

	

	
	
	
}
