package BaseClassCodeWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class CodeForProject1 {
	
	public static WebDriver driver;
	
public  WebDriver launchChrome() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    return driver;
}

	
public  void launchURL(String arg0) {
    driver.get(arg0);
}

	
public void sendData(WebElement a,String b) {
	a.sendKeys(b);
}

	
public void click(WebElement a) {
	a.click();
}	


public void implicitWait(int a) {
	driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
}


public void quitBrowser() {
    driver.quit();
}

public void dropdown(WebElement element,String arg0) {
Select s = new Select(element);
s.selectByVisibleText(arg0);
}


public String getDataFormExcel(int celll) throws IOException {
	
     String value = null;

     File f = new File("C:\\Users\\Public\\Documents\\MavenAdactinPRO\\ExcelData\\AdactinData.xlsx");
     FileInputStream fin = new FileInputStream(f);
     Workbook w = new XSSFWorkbook(fin);
     Sheet sheet = w.getSheet("Sheet1");
     Row row = sheet.getRow(1);
     Cell cell = row.getCell(celll);
     CellType type = cell.getCellType();
     
     switch (type) {
     
	case STRING:
		 value = cell.getStringCellValue();
		break;
		
    case NUMERIC:
		if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
			 value = dateFormat.format(dateCellValue);
			
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long)numericCellValue;
			 value = String.valueOf(l);

		}
		break;

	default:
		break;
	}
     return value;
}


public String getAttributeValue(WebElement element) {
String attribute = element.getAttribute("value");
return attribute;
}


public WebElement xxpathId(String id) {
WebElement findElement = driver.findElement(By.id(id));
return findElement;
}


public void threadSleep(long millis) throws InterruptedException {
Thread.sleep(millis);
}


public WebElement xxpathName(String name) {
WebElement findElement = driver.findElement(By.name(name));
return findElement;
}









	
	
	
	
}
