package testpack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ParameterTest {

	@Parameters({ "urls", "url" })
	@Test
	public void parameterTest(String url, String url2) {
		System.out.println("Parameter Test");
		System.out.println(url);
		System.out.println(url2);
		
	}

	@Test(dataProvider = "getData")
	public void dayaProviderImplement(String user, String pass) {
		System.out.println(user);
		System.out.println(pass);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "manohar";
		data[0][1] = "123456";
		data[1][0] = "manohar1";
		data[1][1] = "123456";
		data[2][0] = "manohar2";
		data[2][1] = "123456";
		return data;
	}
}
