package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class CalculatorControllerTest {

	@Autowired
	CalculatorController calculator;
	
	@Test
	public void testadd()
	{
		System.out.println(calculator.add(2, 3));
		assertEquals(5, calculator.add(2, 3));
	}
	@Test
	public void testsub()
	{
		assertEquals(7, calculator.sub(12, 5));
	}
	@Test
	public void testmul()
	{
		assertEquals(25, calculator.mul(5, 5));
	}
	@Test
	public void testdiv()
	{
		assertEquals(5, calculator.div(25, 5));
	}

}
