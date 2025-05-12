package api;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UpdateUserTest extends BaseTest{
	
	@Test
	public void updateUserTest()
	{
		Map<String, Object> updatemap = new HashMap<>();
		updatemap.put("Title", "This is updated map");
		updatemap.put("body", "This is an updated post");
		updatemap.put("userId", 1);
		
		given()
			.header("Content-Type", "application/json")
			.body(updatemap)
		.when()
			.put("/posts/1")
		.then()
			.statusCode(200)
			.body("Title", equalTo("This is updated map"));
		
	}

}
