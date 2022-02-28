package com.xml.YaminiMavenProject;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Division {
	public static int Checkcal(int a,int b)
	{
		int div=a/b;
		return div;
	}
	@Test
	public void testdiv()
	{
		assertEquals(1,Division.Checkcal(2,2),0);
	}
}