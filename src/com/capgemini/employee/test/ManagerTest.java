package com.capgemini.employee.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.Manager;

class ManagerTest {
	Manager manager ;
	
	@BeforeEach
	public void setUP() {
		manager = new Manager(101,"john doe",20000,1234);
	}
	
	@Test
	public void testManagerGrossSalary() {
		assertEquals(36034, manager.calculateGrossSalary());
	}
	
	@Test
	public void testNetGrossSalary() {
		manager.calculateGrossSalary();
		assertEquals(33434, manager.calculateNetSalary());
	}
	

}
