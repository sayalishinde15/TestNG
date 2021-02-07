package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Basics {
	
	
	@BeforeSuite
	public static void SuiteInit() {
		System.out.println("SuiteInit");
	}
	
	@AfterSuite
	public static void SuiteEnd() {
		System.out.println("SuiteEnd");
	}
	
	@BeforeClass
	public static void ClassInit() {
		System.out.println("ClassInit");
	}
	
	@AfterClass
	public static void ClassEnd() {
		System.out.println("ClassEnd");
		
		}
	
	@BeforeMethod
	public static void MethodInit() {
		System.out.println("MethodInit");
	}
	
	@AfterMethod
	public static void MethodEnd() {
		System.out.println("MethodEnd");
	}
	
	@BeforeTest
	public static void TestInit() {
		System.out.println("TestInit");
	}
	
	@AfterTest
	public static void TestEnd() {
		System.out.println("TestEnd");
	}
	
	
	@Test(priority=1,groups="Regression")
	public static void print() {
		System.out.println("printing");
	}
	
	@Test(groups="Regression")
	public static void write() {
		System.out.println("writing");
	}
	
	@Test(priority=-1,groups="Smoke")
	public static void speak() {
		System.out.println("speaking");
	}
	
	@Test(priority=-1, groups="Sanity")
	public static void dance() {
		System.out.println("dancing");
	}
	
	

}
