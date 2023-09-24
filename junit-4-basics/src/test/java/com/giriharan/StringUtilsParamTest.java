package com.giriharan;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringUtilsParamTest {
	
	StringUtils su;
	String s1,s2,expected;
	
	@Before
	public void init()
	{
		su = new StringUtils();
	}
	
	public StringUtilsParamTest(String s1,String s2,String res)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.expected = res;
	}
	
	
	@Parameters
	public static Object[] testAddValues() {
		return new Object[] {
			new Object[] {"Hello","World","HelloWorld"},
			new Object[] {"","world" ,"world"},
			new Object[] {"hello","","hello"}
		};
	}
	
	@Test
	public void testAdd() {
		assertEquals(expected,su.addString(s1, s2));
	}

}
