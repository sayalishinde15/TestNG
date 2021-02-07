package TestNGPractice;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test(priority=2,groups="Regression")
	public static void print() {
		System.out.println("printing");
	}
	
	@Test(groups="Regression")
	public static void write() {
		System.out.println("writing");
	}
	
	@Test(groups="Smoke")
	public static void speak() {
		System.out.println("dancing");
		int i=9/0;
	}
	
	@Test(priority=1, groups="Sanity",dependsOnMethods="speak")
	public static void dance() {
		System.out.println("speaking");
	
}
}
