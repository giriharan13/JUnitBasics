package com.giriharan;

import java.util.stream.IntStream;

public class StringUtils {
	
	String addString(String s1,String s2)
	{
		return s1+s2;
	}
	
	int countVowels(String s)
	{
		return (int) s.chars().filter(arg -> arg=='a' || arg=='e' || arg=='i' || arg=='o' || arg=='u').count();
	}

}
