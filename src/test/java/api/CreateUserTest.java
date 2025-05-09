package api;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import utils.AssertUtils;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class CreateUserTest {

	@Test
	public void postcreateUserTest()
	{
		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("title", "Test Post");
		requestBody.put("body", "This is Test Body");
		requestBody.put("userId", 1);
		
		Response response = given()
		.header("Content-Type","application/json")
		.body(requestBody)
		.log().all()
		.when()
			.post("/posts")
		.then().statusCode(201)
		.log().all()
								//.body("title", equalTo("Test Post"))
						//.body("userId", equalTo(1))
		.extract().response();
		
		AssertUtils.assertStatusCode(response.statusCode(), 201);
		AssertUtils.assertStringContains(response.body().asString(), "This is Test Body");
	}
}
