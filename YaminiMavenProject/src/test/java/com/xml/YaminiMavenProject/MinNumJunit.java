package com.xml.YaminiMavenProject;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
	public class MinNumJunit {
		public static int CheckMin(int arr[])
		{
			int min=8;
			for(int num:arr)
			{
				if(min>num)
					min=num;
			}
			System.out.println(min);
			return min;
		}
			@Test
			public void testMin()
			{
				assertEquals(2,MinNumJunit.CheckMin(new int[]{2,4,5,8}));
			}
}
