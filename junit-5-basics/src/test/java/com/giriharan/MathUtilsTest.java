package com.giriharan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mu = new MathUtils();
		int expected = 2;            // Expected value
		int actual = mu.add(1, 1);   // Actual value
		
		assertEquals(expected,actual);     // assertEquals(exp,act)  takes two arguments and checks if the expected and actual results are the same
		
		
		/*
		 * Assertions
		 * org.junit.jupiter.api.Assertions provides all the assertions
		 * -methods are
		 * 		void assertEquals(boolean expected,boolean actual)
		 *      void assertTrue(boolean condition)
		 *		void assertFalse(boolean condition)
		 *		void assertNull(Object obj)
		 *		void assertNotNull(Object obj)   
		 *      .............   
		 */
		
	}
	
	@Test
	void testAddArray() {
		MathUtils mu = new MathUtils();
		int a[] = {1,2,4};
		int b[] = {4,5,6};
		int[] actual = mu.addArray(a,b);
		int expected[] = {5,7,9};
		
		//assertArrayEquals(expected,actual);
		
		// you can also add a message as a third argument. This helps if multiple devs are working on the code
		assertArrayEquals(expected,actual,"the addArray() method is supposed to add two arrays");
	}
	
	/*
	 * there are also methods for compare arrays and iterables
	 *     void assertArrayEquals(int[] a,int[] b)
	 *     void	assertIterableEquals(Iterable<?> expected, Iterable<?> actual)
	 *     ............
	 */
	
	@Test
	void testDivide() {
		MathUtils mu = new MathUtils();
		assertThrows(ArithmeticException.class, ()->mu.divide(1, 0),"Dividing by zero should throw");
		
		//assertThrows() can be used to check if any testcase should thrown an Exception
		
	}
	
	
	
	// visit the junit doc for all the assert methods

}
