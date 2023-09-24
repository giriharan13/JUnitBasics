package com.giriharan;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringUtilsTest1 {
	
	StringUtils su;
	
	@Before
	public void init()
	{
		su = new StringUtils();
	}

	@Test
	public void testAdd() {
		assertEquals("HELLO WORLD!", su.addString("HELLO", " WORLD!"));
	}
	
	
	@Test
	public void testCountVowels()
	{
		assertEquals(5, su.countVowels("aeiou"));
	}

}
