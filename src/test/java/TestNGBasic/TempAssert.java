package TestNGBasic;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TempAssert {

	@Test
	private void tc1() {
		String a = "hello";
		String b = "Welcome";

		// boolean contains = a.contains("man");

		Assert.assertEquals("Vanakam", a);

	}

	@Test
	private void tc2() {
		String a = "hello";
		String b = "Welcome";

		SoftAssert assert1 = new SoftAssert();

		assert1.assertEquals("RoryMcCann", "helloṣ");
		System.out.println("QQQQQQQQQQQQQQ");
	}

	
	
}
