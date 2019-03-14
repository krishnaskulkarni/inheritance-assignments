package com.capgemini.employee.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.model.BankAccount;

public class BankAccountTest {

	BankAccount account;
	
	@BeforeEach
	public void setUp() {
		account = new BankAccount(101,"john doe","SAVING",30000);
	}
	
	@Test
	public void testWithdraw() {
		assertEquals(25000, account.withdraw(5000));
	}

}
