package com.giriharan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest2 {

	/* -In the previous MathUtilsTest we have created an instance of MathUtils class
	 *  in each method.
	 * -Instead we can define methods with annotations like 
	 *            @AfterAll, @AfterEach, @BeforeAll, @BeforeEach
	 *  to create instances before/after class instantiation or before/after each test method
	 */
	
	MathUtils mu;
	
	@BeforeEach
	void init()
	{
		this.mu = new MathUtils();
		System.out.println("Before each test....");
	}
	
	// This init() method now runs before each test method
	
	@AfterEach
	void del()
	{
		System.out.println("Cleaning up after each test....");
	}
	
	// This del() method now runs after each test method
	
	/* However for @BeforeAll and @AfterAll , we cannot use non-static methods.
	 * This is because if we annotate the methods with these, then they will be called before 
	 * class instantiation.So we need to provide static methods
	 */
	
	@BeforeAll
	static void init_before()
	{
		System.out.println("This is before class instatiation");
	}
	
	@AfterAll
	static void def_after()
	{
		System.out.println("This is after the test methods ran");
	}
	
	
	@Test
	void testSubtract()
	{
		int expected = 5;
		int actual = this.mu.subtract(10, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	void testMultiply()
	{
		int expected = 50;
		int actual = this.mu.multiply(10, 5);
		assertEquals(expected, actual);
	}

}
