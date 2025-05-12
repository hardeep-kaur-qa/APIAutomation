package api;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class DeleteUserTest extends BaseTest{
	
	@Test
	public void deleteUserTest()
	{
		given()
		.when()
			.delete("/posts/1")
		.then()
			.statusCode(200);
	}
}
