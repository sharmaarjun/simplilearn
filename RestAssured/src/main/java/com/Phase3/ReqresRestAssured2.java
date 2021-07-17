package com.Phase3;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;

public class ReqresRestAssured2 {
	
	//instead of given() use this---
	RequestSpecification request = null;
	
	@Before
	public void beforeTest() {
		RestAssured.baseURI="https://reqres.in";
		//add the following statement
		request = RestAssured.given();
	}
	
	@Test
	public void ApiTest2() {
		System.out.println(request.get("/api/users/2").getBody().asString());
	//using given >> when >> then
	String responseValue =request
					.given()
						.header("content-type","text/xml")
						.header("header2","xyx")
					.when()
						.get("/api/users")
					.then()
						.extract().response().asPrettyString();
	
	System.out.println(responseValue);
	}
	
	

	
}
