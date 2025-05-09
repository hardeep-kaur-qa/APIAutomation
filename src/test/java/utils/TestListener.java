package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestListener implements ITestListener
{
	ExtentReports extent = ExtentManager.getInstance();
	ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	
	
	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest extenttest = extent.createTest(result.getMethod().getMethodName());
		test.set(extenttest);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		test.get().log(Status.PASS, "Test Passed!");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		
		test.get().log(Status.FAIL, result.getThrowable());
	}
	@Override
	public void onFinish(ITestContext context) {
		
		extent.flush();
	}
	
	
}
