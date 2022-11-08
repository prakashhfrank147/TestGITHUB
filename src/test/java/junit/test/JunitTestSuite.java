package junit.test;

import org.junit.Test;
import org.junit.internal.runners.TestClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.baseclass.JunitTest;
import com.google.common.util.concurrent.ExecutionList;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalulatorTest.class, FactorialTest.class, JunitTest.class})
public class JunitTestSuite {
	
//	public static void main(String[] args) {
//		
//		Result result = JUnitCore.runClasses(JunitTestSuite.class);
//		 System.out.println(result);
//		
//		int runCount = result.getRunCount();
//		System.out.println("run count:"+runCount);
//		
//		long runTime = result.getRunTime();
//		System.out.println(runTime);
//		
//		int failureCount = result.getFailureCount();
//		System.out.println(failureCount);
//		
//		System.out.println("passcount"+(runCount-failureCount));
//		
//		
//		
//		
//	}

}
