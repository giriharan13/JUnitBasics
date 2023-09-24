package com.giriharan;

public class MathUtils {
	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int[] addArray(int[] a,int[] b)
	{
		int max = (a.length>b.length)?a.length:b.length;
		int res[] = new int[max];
		for(int i=0;i<max;i++)
		{
			if(i<a.length && i<b.length)
				res[i] = a[i]+b[i];
			else if(i<a.length)
				res[i] = a[i];
			else
				res[i] = b[i];
		}
		return res;
	}
	
	public int subtract(int a,int b)
	{
		return a-b;
	}
	
	public int multiply(int a,int b)
	{
		return a*b;
	}
	
	public int divide(int a,int b)
	{
		return a/b;
	}

}
