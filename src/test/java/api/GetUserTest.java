package api;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUserTest extends BaseTest
{

	@Test
	public void getSingleUserTest()
	{
		given()
		.when()
			.get("/users/2")
		.then().statusCode(200)
		.body("username", equalTo("Antonette"))
		.body("email", equalTo("Shanna@melissa.tv"));
		
	}
}
