package com.capgemini.employee.model;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
    double hra;
	double medicle;
	double pt;
	double pf;
	private double netSalary;
	private double grossSalary;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, double basicSalary, double medicle) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medicle = medicle;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getMedicle() {
		return medicle;
	}

	public void setMedicle(double medicle) {
		this.medicle = medicle;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double calculateGrossSalary() {
		this.grossSalary = basicSalary + basicSalary / 2 + medicle;
		return grossSalary;
	}

	public double calculateNetSalary() {
		this.netSalary = grossSalary - (200 + 0.12 * basicSalary);
		return netSalary;
	}

}
