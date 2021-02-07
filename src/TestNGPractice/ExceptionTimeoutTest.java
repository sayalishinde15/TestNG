package TestNGPractice;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	/*
	 * @Test(invocationTimeOut=2000) public void infiniteloop() { int i=1;
	 * 
	 * while(i==1) { System.out.println(i); } }
	 */
	
	@Test(expectedExceptions=ArithmeticException.class)
	public  void numberformat() {
		int i=9/0;
	}

}
