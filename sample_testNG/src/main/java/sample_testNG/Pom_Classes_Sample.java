package sample_testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pom_Classes_Sample {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("in before class");
		
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("in before method");
	}
	@Test (invocationCount=2)
	public void test() {
		System.out.println("in test");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("in after method");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("in after class");
	}
}
