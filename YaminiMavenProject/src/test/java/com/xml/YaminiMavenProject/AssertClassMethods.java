package com.xml.YaminiMavenProject;
import static org.junit.Assert.*;
import org.junit.Test;
public class AssertClassMethods {
		@Test		
		    public void TestAssert(){		
		        String str1="Yamini";					
		        String str2="yamini";
		        String str3="Yamini";
		        String str4=null;					
		        int a=1;					
		        int	b=2;					
		        int[] arr1={10,20,30};
		        int[] arr2={10,20,30};		
		        assertEquals(str1,str3);					
		        assertSame(str1,str3);					
		        assertNotSame(str1,str2);					
		        assertNotNull(str1);			
		        assertNull(str4);			
		        assertTrue(a<b);					
		        assertArrayEquals(arr1,arr2);
		}
}