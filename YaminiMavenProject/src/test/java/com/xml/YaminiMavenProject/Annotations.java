package com.xml.YaminiMavenProject;
import org.junit.*;
public class Annotations {
	 @Before
	    public void runBeforeTestMethod() {
	        System.out.println("@Before - runBeforeTestMethod");
	    }
	@After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }
    @BeforeClass
    public static void runBeforeClassTestMethod() {
    	System.out.println("@BeforeClass - runBeforeClassTestMethod");
    	}
    @AfterClass
    public static void runAfterClassTestMethod() {
        System.out.println("@AfterClass - runAfterClassTestMethod");
    }
    @Ignore
    public void Ignore()
    {
    	System.out.println("@Ignore - Ignore of Statement");
    }
    @Test
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }
    @Test(timeout=300)
    public void test_withtimeout() {
        System.out.println("@Test_withtimeout -test_withtimeout");
    }
}