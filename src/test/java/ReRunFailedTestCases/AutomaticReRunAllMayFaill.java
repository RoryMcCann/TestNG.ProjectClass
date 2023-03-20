package ReRunFailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomaticReRunAllMayFaill   {


	@Test
	private void tcl() {
System.out.println("Result of Test 1");
	}
	
	@Test
	private void tc2() {
System.out.println("Result of Test 2");
	}
	
	@Test
	private void tc3() {
System.out.println("Result of Test 3");
	}
	
	@Test
	private void tc4() {
System.out.println("Result of Test 4");
	}
	
	@Test(retryAnalyzer=FailedTestCode.class)  
	private void tc5() {
		Assert.assertTrue(false);
System.out.println("Result of Test 5");
	}
	
		
	}
	
	
	


