package rEQRESExample;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import utility.constant;

public class TC_03_VerifyListUser {
	
	@Test
	
	public void verifyListUser() {
		
		baseURI = constant.API_REQRES_URL;
		
		Response res = get("/api/users?page=2");
		
		int statusCode = res.getStatusCode();
		
		System.out.println(statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		System.out.println(res.getContentType());
		
		
		given().
		
		
		when().
		
		
		then();
		
		
	}

}
