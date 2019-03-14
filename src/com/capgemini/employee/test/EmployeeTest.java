package com.capgemini.employee.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Employee;

class EmployeeTest {
	Employee employee;
	
	@BeforeEach
	public void setUp() {
		employee = new Employee(101,"john doe",20000,1234);
	}
	
	@Test
	public void testEmployeeObjectisCreatedWithNoDefaultConstructor() {
		Employee employee = new Employee();
		assertNotNull(employee);
	}
	
	@Test
	public void testEmployeeObjectisCreatedWithParameterisedConstructor() {
		Employee employee = new Employee(101,"john doe",20000,1234);
		assertEquals(101, employee.getEmployeeId());
		assertEquals("john doe", employee.getEmployeeName());
		assertEquals(20000, employee.getBasicSalary());
		assertEquals(1234, employee.getMedicle());
	}
	
	@Test
	public void testGrossSalaryofEmployee() {
		assertEquals(31234, employee.calculateGrossSalary(),0.02);
	}
	
	@Test
	public void testNetSalaryofEmployee() {
		employee.calculateGrossSalary();
		assertEquals(28634, employee.calculateNetSalary());
	}
	
	

}
