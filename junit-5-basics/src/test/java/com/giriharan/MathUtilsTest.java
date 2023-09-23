package com.giriharan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
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
		 */
		
	}

}
