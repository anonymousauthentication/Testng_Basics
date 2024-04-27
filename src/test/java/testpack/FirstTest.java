package testpack;

import org.testng.annotations.*;

public class FirstTest {

	
	@Test(dependsOnMethods="firstTest")
	public void  afirstTest() {
		System.out.println("aFirstTest Method1");
	}
	
	@Test(groups= {"smoke"})
	public void  firstTest() {
		System.out.println("FirstTest Method1");
	}

	@Test
	public void secondTest() {
		System.out.println("FirstTest Method2");
	}
	
	@BeforeTest(alwaysRun=true)
	public void beforeTest() {
		System.out.println("BeforeTest FirstTest Class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest FirstTest Class");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("BeforeClass FirstTest Class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("AfterClass FirstTest Class");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite FirstTest Class");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite FirstTest Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method FirstTest Class");
	}
	
	@AfterMethod
	public void aforeMethod() {
		System.out.println("After Method FirstTest Class");
	}

}
