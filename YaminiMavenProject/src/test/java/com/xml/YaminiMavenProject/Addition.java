package com.xml.YaminiMavenProject;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Addition {
	public static int Checkcal(int a,int b)
	{
		int add=a+b;
		return add;
	}
	@Test
	public void testadd()
	{
		assertEquals(4,Addition.Checkcal(2,2),0);
	}
}
