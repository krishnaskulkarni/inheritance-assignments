package com.capgemini.employee.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.capgemini.employee.model.MarketingExecutive;

class MarketingExecutiveTest {

	MarketingExecutive marketingExecutive;
	
	@BeforeEach
	public void setUp() {
		marketingExecutive = new MarketingExecutive(101,"john doe",20000,1234,150);
	}
	@Test
	void testcalculateGrossSalary() {
		assertEquals(33484, marketingExecutive.calculateGrossSalary());
	}
	
	@Test
	void testcalculateNetSalary() {
		marketingExecutive.calculateGrossSalary();
		assertEquals(30884, marketingExecutive.calculateNetSalary());
	}

}
