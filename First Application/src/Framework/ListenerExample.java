package Framework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenerExample implements ITestListener {
  @Test
  public void f() {
  }

@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("start");
}

@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("success");
}

@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("fail");
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("skipped");
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("percentage");
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	System.out.println("onstart");
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	System.out.println("finish");
}
}
