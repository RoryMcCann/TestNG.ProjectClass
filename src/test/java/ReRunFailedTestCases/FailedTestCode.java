package ReRunFailedTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedTestCode implements IRetryAnalyzer
{

	int a=0, b=3;
	public boolean retry(ITestResult result)
	{
		if (a<=b)
		{
			a++;
			return true;
		}
		else
		{
			
			return false;
	}
	}
    }
