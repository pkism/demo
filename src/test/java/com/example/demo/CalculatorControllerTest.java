package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.CalculatorController;

class CalculatorControllerTest {

	
	
	@Test
	public void testadd()
	{
		
		assertEquals(5, CalculatorController.add(2, 3));
	}
	@Test
	public void testsub()
	{
		assertEquals(7, CalculatorController.sub(12, 5));
	}
	@Test
	public void testmul()
	{
		assertEquals(25, CalculatorController.mul(5, 5));
	}
	@Test
	public void testdiv()
	{
		assertEquals(5, CalculatorController.div(25, 5));
	}
	@Test
    public void testsquare()
    {
    	assertEquals(25, CalculatorController.square(5));
    }
}
