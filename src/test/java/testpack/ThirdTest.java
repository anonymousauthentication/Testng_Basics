package testpack;

import org.testng.annotations.Test;

public class ThirdTest {
	
	@Test(priority=1,groups="smoke")
	public void firstTest() {
		System.out.println("ThirdTest Method1");
	}
	
	@Test
	public void secondTest() {
		System.out.println("ThirdTest Method2");
	}
	
	@Test
	public void thirdTest() {
		System.out.println("ThirdTest Method3");
	}
	
	@Test
	public void mobileTest() {
		System.out.println("Mobile Test case1");
	}
	
	@Test
	public void mobileTest2() {
		System.out.println("Mobile Test case2");
	}
}
