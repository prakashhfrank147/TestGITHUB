package junit.test;

import org.junit.Test;

import junit.framework.Assert;

public class FactorialTest {
	
	
	
	@Test
	public void fact() {
		int n=5;
		int fact=1;
		for (int i = 1; i <= n; i++) {
			
			fact=fact*i;
			
		}
		int expected=120;
		int actual=fact;
		Assert.assertEquals(expected, actual);
		System.out.println("factorial of :"+n+" is"+fact);

	}

}
