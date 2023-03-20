

package SuiteParameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClassCodeWrite.CodeForProject1;

public class Sample1 extends CodeForProject1{
	
	
	
	@Parameters({"userId","userPass"})
	@Test
	private void fblogin(@Optional("hello Macha")String a, @Optional("Itan Password daw")String b) {

		launchChrome();
		implicitWait(20);
		launchURL("https://www.facebook.com/");
		
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("book");
		
		System.out.println("Url Contain book "+contains);
		
		/*WebElement userId = driver.findElement(By.xpath("//input[@type=\'text\']"));
		userId.sendKeys(a);*/
		
		sendData(driver.findElement(By.xpath("//input[@type=\'text\']")), a);
		
		WebElement userPass = driver.findElement(By.xpath("//input[@name=\'pass\']"));
		userPass.sendKeys(b);
		
		quitBrowser();
		
		
	}
	
	

}
