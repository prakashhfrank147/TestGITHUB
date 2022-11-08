package pom.task;

import java.io.IOException;

import com.baseclass.BaseClass;

public class Task1 extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {

		Task1 t = new Task1();
		getDrive();
		driver.manage().window().maximize();
		t.getUrl("https://adactinhotelapp.com/");

		Login1 l = new Login1();
		l.firstPage("Greens8767", "L4R739");
		Thread.sleep(5000);

		Login2 l2 = new Login2();

		l2.secondPage();
		
		Login3 l3 = new Login3();
		l3.thirdPage();
	}
}
