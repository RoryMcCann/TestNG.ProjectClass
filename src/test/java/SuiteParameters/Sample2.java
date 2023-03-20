package SuiteParameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample2 {
	
	@Parameters({"a","b"})
	@Test
	private void tc1(String s1 , String s2) {
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
	}

	@Parameters({"a","C"})
	@Test
	private void tc2(@Optional("vanakam Mapla")String s1,@Optional("Intha Vanthutan la")String s2) {

		System.out.println(s1); 
		System.out.println(s2);		
		
	}
	
	
}
