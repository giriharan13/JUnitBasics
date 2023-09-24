package com.giriharan;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest3 {

	/* -In the previous MathUtilsTest2 we have created static methods for
	 *  @BeforeAll and @AfterAll annotated methods.
	 * -But we can also use non-static methods by using @TestInstance(TestInstance.Lifecycle.PER_CLASS)).
	 * -This tells JUnit to create a single instance for every method.
	 * -This instance will be created first, then the @BeforeAll annotated method gets 
	 *  called and hence it does'nt need static methods.
	 */
	
	/* 
	 * - @TestInstance(TestInstance.Lifecycle.PER_METHOD) can be used to create new instance 
	 * for every testMethod
	 */
	
	MathUtils mu; 
	
	@BeforeAll
	void init()
	{
		System.out.println("Before all(non-static)");
		mu = new MathUtils();
	}

	@AfterAll
	void del()
	{
		System.out.println("After all (non-static) ");
	}
	
	@Test 
	@DisplayName("multiply() tester")  // @DisplayName() - to improve readability 
	void testMultiply()
	{
		boolean isServerUp = true;
		int expected = 5;
		int actual = mu.multiply(1,5);
		
		
		assumeTrue(isServerUp);   // assumeTrue(value) - this doesn't run the test if the value is false
		assertEquals(expected,actual);
	}
	
	@Test
	@Disabled   // @Disabled - to disable a test
	void test()
	{
		System.out.println("This test is disabled");
	}
	
	@Test
	void testAdd()
	{
		assertAll(
			()-> assertEquals(7,mu.add(5, 2)),
			()-> assertNotEquals(20,mu.add(10, 2))
				); 
		
		// You can also use assertAll() to test multiple assert statements. 
		// You should pass the executables that use the respective assert statements
	}
	
	
}
