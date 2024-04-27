package testpack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ParameterTest3 {

	@Parameters("url")
	@Test
	public void parameterTest(String urlclass) {
		Assert.assertTrue(false);
		System.out.println("parameterTest 3");
		System.out.println(urlclass);
	}
}
