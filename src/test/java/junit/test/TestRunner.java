package junit.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

public class TestRunner {
public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(JunitTestSuite.class);
		 System.out.println(result);
		
		int runCount = result.getRunCount();
		System.out.println("run count:"+runCount);
		
		long runTime = result.getRunTime();
		System.out.println("run time:"+runTime);
		
		int failureCount = result.getFailureCount();
		System.out.println("failure count:"+failureCount);
		
	
		
		System.out.println("passcount"+(runCount-failureCount));
		
		
		
		
		
	}

}
