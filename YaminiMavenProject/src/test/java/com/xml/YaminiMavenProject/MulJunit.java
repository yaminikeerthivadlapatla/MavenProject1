package com.xml.YaminiMavenProject;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class MulJunit {
	public static int Checkcal(int a,int b)
	{
		int mul=a*b;
		return mul;
	}
	@Test
	public void testmul()
	{
		assertEquals(4,MulJunit.Checkcal(2,2),0);
	}
	

}
