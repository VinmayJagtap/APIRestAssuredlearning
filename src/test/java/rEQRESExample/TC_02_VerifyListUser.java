package rEQRESExample;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utility.constant;

public class TC_02_VerifyListUser {
	
	@Test
	
	public void verifyListUser() {
		
		RestAssured.baseURI = constant.API_REQRES_URL;
		
		Response res = RestAssured.get("/api/users?page=2");
		
		int statusCode = res.getStatusCode();
		
		System.out.println(statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		System.out.println(res.getContentType());
		
		
	}

}
