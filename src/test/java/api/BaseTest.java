package api;

import java.util.logging.Logger;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;


public class BaseTest {
	
	//protected Logger logger=  Logger.getLogger(getClass().getName());
	
	@BeforeClass
	public void setup()
	{
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
		
	}

}
