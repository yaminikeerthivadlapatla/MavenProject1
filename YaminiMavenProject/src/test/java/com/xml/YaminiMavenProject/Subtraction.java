package com.xml.YaminiMavenProject;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Subtraction {
	public static int Checkcal(int a,int b)
	{
		int sub=a-b;
		return sub;
	}
	@Test
	public void testsub()
	{
		assertEquals(0,Subtraction.Checkcal(2,2),0);
	}
	

}