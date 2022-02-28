package com.xml.YaminiMavenProject;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class StringTest {
	public static boolean checkString(String s)
	{
		String str="Yamini";
		if(str.contains(s))
		{
			return true;
		}
		return false;
	}
		@Test
		public void testCheckStr()
		{
			assertEquals(false,checkString("Keeerthi"));
		}
	

	}
