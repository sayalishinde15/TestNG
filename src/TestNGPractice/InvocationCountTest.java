package TestNGPractice;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount=10)
	public static void sum() {
		int a=5;
		int b=10;
		
		int c=a+b;
		System.out.println("Sum : "+ c);
	}

}
