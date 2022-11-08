package junit.test;



import org.junit.Test;

import junit.framework.Assert;

public class CalulatorTest {
	
	
	@Test
	public void add() {
		int a=10; int b=10;
		int c=a+b;
		int expected=20;
		int actual=c;
		Assert.assertEquals(expected, actual);
		System.out.println(a+"+"+b+" == "+expected);
		
	}
	@Test
	public void sub() {
		int a=20; int b=10;
		int c=a-b;
		int expected=10;
		int actual=c;
		Assert.assertEquals(expected, actual);
		System.out.println(a+"-"+b+" == "+expected);
}}
