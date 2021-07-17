package com.Phase3;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;
import static org.hamcrest.Matchers.equalTo;
public class ReqresRestAssured3 {
	
	//instead of given() use this---
	RequestSpecification request = null;
	
	@Before
	public void beforeTest() {
//		RestAssured.baseURI="https://reqres.in";
		RestAssured.baseURI="https://postman-echo.com";
		//add the following statement
		request = RestAssured.given();
	}
//	
//	@Test
//	public void ApiTest3_Logs() {
//		
//	//using given >> when >> then
//	//String responseValue =request
//	int responseCode=request
//					.given()
//						.header("content-type","text/xml")
//						.header("header2","xyx")
//					.when()
//						.get("/api/users")
//					.then()
////						.log().body();
//						.log().all()
////					.and()
//						//.extract().response().getStatusCode();
//					.and()
//                        .extract().response()
//                    .andReturn()
//                       .statusCode();
//	System.out.println("Response code = "+responseCode);
//	//System.out.println(responseValue);
//	}

//	@Test
//	public void ApiTest4_Assertion() {
//		
//	//using given >> when >> then
//	//String responseValue =request
//	int responseCode=request
//					.given()
//						.header("content-type","text/xml")
//						.header("header2","xyx")
//					.when()
//						.get("/api/users")
//					.then()
//						.log().all()
//					.and()
//                        .assertThat().body("page", equalTo(1))
//                        			 .body("data[0].email", equalTo("george.bluth@reqres.in"))
//                        .extract().response()
//                    .andReturn()
//                       .statusCode();
//	System.out.println("Response code = "+responseCode);
//	//System.out.println(responseValue);
//	}

	@Test
	public void ApiTest5_BasicAuth() {
		
	//using given >> when >> then
	//String responseValue =request
	String responseCode=request
					.given()
						.auth()
						.basic("postman", "password")
					.when()
						.get("basic-auth")
					.then()
						.log().all()
					.and()
                        .assertThat().statusCode(200)
                     .and()
                        .extract().response().getBody().asPrettyString();
                    
	System.out.println("Response code = "+responseCode);
	//System.out.println(responseValue);
	}
	
}
