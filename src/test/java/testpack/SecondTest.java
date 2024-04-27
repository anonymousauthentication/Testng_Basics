package testpack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTest {
	
	@Test( groups= {"smoke"})
	public void firstTest() {
		System.out.println("SecondTest Method1");
	}
	
	@Test(priority=1)
	public void secondTest() {
		System.out.println("SecondTest Method2");
	}
	
	@Test
	public void thirdTest() {
		System.out.println("SecondTest Method3");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest SecondTest Class");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest SecondTest Class");
	}
}
