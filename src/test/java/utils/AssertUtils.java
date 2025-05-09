package utils;

import org.testng.Assert;

public class AssertUtils {
	
	public static void assertStatusCode(int actual, int expected)
	{
		Assert.assertEquals(actual, expected, "Status Code Mismatch");
	}
	
	public static void assertStringContains(String actual, String expectedSubString)
	{
		Assert.assertTrue(actual.contains(expectedSubString),
				"Expected Substring '" + expectedSubString + "' not found in: " + actual);
	
	}

}
