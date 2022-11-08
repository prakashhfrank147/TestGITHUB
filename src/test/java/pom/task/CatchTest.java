package pom.task;

import java.net.URL;

import com.baseclass.BaseClass;

public class CatchTest extends BaseClass {
	
	
	
	public static void main(String[] args) {
		CatchTest c=new CatchTest();
		getDrive();
		c.getUrl("https://www.facebook.com/");
		
		POM p=new POM();
		p.withoutCatch();
		p.withtCatch();
		
	}

}
