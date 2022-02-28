package com.xml.YaminiMavenProject;

import static org.junit.Assert.assertEquals;
import org.junit.*;
public class MaxNumJunit {
	public static int CheckMax(int arr[])
	{
		int max=0;
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println(max);
		return max;
	}
		@Test
		public void testMax()
		{
			assertEquals(8,MaxNumJunit.CheckMax(new int[]{2,5,8,4}));
		}
}
