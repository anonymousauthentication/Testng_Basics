package testpack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest2 {

	@Parameters("url")
	@Test
	public void parameterTest2(String urlTest) {
		System.out.println("Parameter Test2");
		System.out.println(urlTest);
	}
}
